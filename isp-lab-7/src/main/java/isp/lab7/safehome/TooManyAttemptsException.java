package isp.lab7.safehome;

public class TooManyAttemptsException extends Exception{
    @Override
    public String getMessage() {
        return "TooManyAttemptsException";
    }
}
