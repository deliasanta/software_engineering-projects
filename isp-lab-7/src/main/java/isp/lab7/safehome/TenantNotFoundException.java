package isp.lab7.safehome;

public class TenantNotFoundException extends Exception{
    @Override
    public String getMessage() {
        return "TenantNotFoundException";
    }
}
