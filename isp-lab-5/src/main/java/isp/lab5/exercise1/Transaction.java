package isp.lab5.exercise1;

public abstract class Transaction {
    private Account account;

    public Account getAccount() {
        return account;
    }


    public abstract String execute();

}
