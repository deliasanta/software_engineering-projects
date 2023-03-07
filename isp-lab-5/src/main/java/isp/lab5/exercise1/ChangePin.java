package isp.lab5.exercise1;

public class ChangePin extends Transaction {
    private String oldPin;
    private String newPin;
    public String execute(){
        return "Change your pin by introducing a new one";
    }

}
