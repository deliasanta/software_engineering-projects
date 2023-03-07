package isp.lab9.exercise3;

public class TenantAlreadyExistsException extends Exception{
    public String getMessage(){
        return "TenantAlreadyExistsException";
    }
}
