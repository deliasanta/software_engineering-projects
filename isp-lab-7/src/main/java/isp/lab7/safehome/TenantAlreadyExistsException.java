package isp.lab7.safehome;

public class TenantAlreadyExistsException extends Exception{
    public String getMessage(){
        return "TenantAlreadyExistsException";
    }
}
