package isp.lab9.exercise3;

public class TenantNotFoundException extends Exception{
    @Override
    public String getMessage() {
        return "TenantNotFoundException";
    }
}
