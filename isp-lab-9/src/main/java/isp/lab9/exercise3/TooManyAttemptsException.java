package isp.lab9.exercise3;

public class TooManyAttemptsException extends Exception{
    @Override
    public String getMessage() {
        return "TooManyAttemptsException";
    }
}
