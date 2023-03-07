package isp.lab7.safehome;

import javax.sql.rowset.spi.TransactionalWriter;
import java.time.LocalDateTime;
import java.util.*;

public class DoorLockController implements ControllerInterface {
    private Integer currentRetries = 0;
    private HashMap<Tenant,AccessKey> validAccess=new HashMap<>();
    private List<AccessLog> accessLogs=new ArrayList<>();
    private Door door;

    public DoorLockController(Door door, List<AccessLog> accessLogs) {
        this.door = door;
        this.accessLogs = accessLogs;
        this.validAccess = new HashMap<>();
        this.validAccess.put(new Tenant(ControllerInterface.MASTER_TENANT_NAME), new AccessKey(ControllerInterface.MASTER_KEY));
    }


    public DoorStatus enterPin(String pin) throws Exception{
        final Map.Entry<Tenant, AccessKey> accessKeyEntry = this.validAccess
                .entrySet()
                .stream()
                .filter(tenantAccessKeyEntry -> tenantAccessKeyEntry.getValue().getPin().equals(pin))
                .findFirst().orElse(null);

        if (Objects.isNull(accessKeyEntry)) { // invalid pin
            currentRetries ++;
            if (this.isPermanentlyLocked()) { // max attempts
                this.currentRetries = 3;
                this.accessLogs.add(this.createAccessLog("","enter pin", "TooManyAttemptsException"));
                throw new TooManyAttemptsException();
            } else {
                this.accessLogs.add(this.createAccessLog("","enter pin" , "InvalidPinException"));
                throw new InvalidPinException();
            }
        } else { // valid pin
            if (accessKeyEntry.getKey().getName().equals(ControllerInterface.MASTER_TENANT_NAME)) { // reset retries
                this.currentRetries = 0;
            } else if (this.isPermanentlyLocked()){
                this.accessLogs.add(this.createAccessLog("", "enter pin", "TooManyAttemptsException"));
                throw new TooManyAttemptsException();
            }

            if (door.getStatus() == DoorStatus.OPEN) {
                door.lockDoor();
            } else {
                door.unlockDoor();
            }

            this.accessLogs.add(this.createAccessLog("", "enter pin", ""));
            return door.getStatus();
        }
     }

     public void addTenant(String pin,String tenantName) throws Exception{
          for(Map.Entry<Tenant,AccessKey> i:validAccess.entrySet()){
              if(i.getKey().getName().equals(tenantName))
              {
                  this.accessLogs.add(this.createAccessLog(tenantName,"add tenant","TenantAlreadyExist"));
                  throw new TenantAlreadyExistsException();
              }

          }
          this.accessLogs.add(this.createAccessLog(tenantName,"add tenant",""));
          this.validAccess.put(new Tenant(tenantName),new AccessKey(pin));
     }

     public void removeTenant(String name) throws Exception{
        int ok=0;
         for(Map.Entry<Tenant,AccessKey> i:validAccess.entrySet()){
             if(i.getKey().getName().equals(name))
             {
                 this.validAccess.remove(i.getKey());
                 this.accessLogs.add(this.createAccessLog(name,"remove tenant","TenantNotFound"));
                 ok=1;
             }
         }
         if(ok==0)
         {
             this.accessLogs.add(this.createAccessLog(name,"remove tenant",""));
             throw new TenantNotFoundException();
         }
     }

     private AccessLog createAccessLog(final String tenant, final String operation, final String errMessage) {
         return new AccessLog(tenant, LocalDateTime.now(), operation, this.door.getStatus(), errMessage);
     }
     public List<AccessLog> getAccessLogs(){
         return accessLogs;
     }

    private boolean isPermanentlyLocked() {
        return this.currentRetries >= 3;
    }


}
