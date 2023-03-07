package isp.lab5.exercise1;

public class Account {
    private String owner;
    private double balance;
    private Card cardClient;

    public Account(String owner,double balance,Card cardClient){
        this.owner=owner;
        this.balance=balance;
        this.cardClient=cardClient;
    }

    public String getOwner() {
        return owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public Card getCardClient() {
        return cardClient;
    }

}
