package isp.lab6.exercise4;

import isp.lab6.exercise1.SensorReading;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Account {
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

class Atm {
    private Bank bank;
    private Card card;

    public Atm(Bank bank,Card card){
        this.bank=bank;
        this.card=card;
    }
    public void changePin(String oldPin, String newPin){
        if(oldPin.equals(this.bank.getAccountByCardId(this.card.getCardId()).getCardClient().getPin()))
            this.bank.getAccountByCardId(this.card.getCardId()).getCardClient().setPin(newPin);
        else
            System.out.println("Your old pin is incorrect");
    }

    public void withdraw(double amount){
        this.bank.getAccountByCardId(this.card.getCardId()).setBalance(this.bank.getAccountByCardId(this.card.getCardId()).getBalance()-amount);

    }

    public void checkMoney(){
        double c=this.bank.getAccountByCardId(this.card.getCardId()).getBalance();
        System.out.println("Your account sold is: "+c);
    }

    public boolean insertCard(Card card, String pin){
        if(card.getPin().equals(pin)) {
            this.card = card;
            return true;
        }
        else
            return false;
    }

    public void removeCard(){
        this.card=null;
    }


    public Transaction tr1changePin(){
        return new ChangePin();
    }

    public Transaction tr2withdraw(){
        return new WithdrawMoney();
    }

    public Transaction tr3checkM(){
        return new CheckMoney();
    }
}

class Bank {
    private List<Account> accounts=new ArrayList<Account>(10);

    public Bank(List<Account> accounts){
        this.accounts=accounts;


    }
    public String executeTransaction(Transaction t){
        return t.execute();
    }

    public Account getAccountByCardId(String cardId){
        for(Account i:accounts)
        {
            if(i.getCardClient().getCardId().equals(cardId))
                return i;
        }
        return null;
    }

}

 class Card {
    private String cardId;
    private String pin;

    public Card(String cardId, String pin){
        this.cardId=cardId;
        this.pin=pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public String getCardId() {
        return cardId;
    }
}

class ChangePin extends Transaction {
    private String oldPin;
    private String newPin;
    public String execute(){
        return "Change your pin by introducing a new one";
    }

}

class CheckMoney extends Transaction{
    public String execute(){
        return "Check your money";
    }

}

abstract class Transaction {
    private Account account;

    public Account getAccount() {
        return account;
    }


    public abstract String execute();

}

class WithdrawMoney extends Transaction{
    private double amount;

    public String execute(){
        return "Withdraw your money please";
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Card card1=new Card("123456","1234");
        Card card2=new Card("345621","1111");
        Card card3=new Card("564321","2323");
       List<Account> accounts=new ArrayList<Account>(10);
        accounts.add(new Account("Malinas Tersinio",5200,card1));
        accounts.add(new Account("Pasca Stefan",1200,card2));
        accounts.add(new Account("Boca Cristian",756,card3));

        Bank BRD=new Bank(accounts);

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your card ID please ");
        String cardId=sc.nextLine();
        Atm atm1=new Atm(BRD,BRD.getAccountByCardId(cardId).getCardClient());
        System.out.println("Hello "+BRD.getAccountByCardId(cardId).getOwner());
        for(int i=1;i<=3;i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Insert your pin please ");
            String pin=scan.nextLine();
            Scanner s = new Scanner(System.in);
            if(atm1.insertCard(BRD.getAccountByCardId(cardId).getCardClient(),pin))
            {
                while(true)
                {

                    System.out.println("Choose 1 for Change Pin");
                    System.out.println("Choose 2 for Withdraw");
                    System.out.println("Choose 3 for Check Money");
                    System.out.println("Choose 4 for EXIT");
                    System.out.print("Choose the operation you want to perform:");
                    int n = s.nextInt();
                    switch(n)
                    {
                        case 1:
                            System.out.println(atm1.tr1changePin().execute());
                            Scanner s1 = new Scanner(System.in);
                            System.out.println("Insert your old pin please ");
                            String oldPin=s1.nextLine();
                            System.out.println("Insert your new pin please ");
                            String newPin=s1.nextLine();
                            atm1.changePin(oldPin,newPin);
                            System.out.println("Your actual pin is: "+BRD.getAccountByCardId(cardId).getCardClient().getPin());
                            break;

                        case 2:
                            System.out.println(atm1.tr2withdraw().execute());
                            Scanner ss = new Scanner(System.in);
                            double amount=ss.nextInt();
                            atm1.withdraw(amount);
                            System.out.println("Your actual balance is: "+BRD.getAccountByCardId(cardId).getBalance());
                            break;

                        case 3:
                            System.out.println(atm1.tr3checkM().execute());
                            atm1.checkMoney();
                            break;

                        case 4:
                            atm1.removeCard();
                            System.exit(0);
                    }



                }
            }
            else
                System.out.println("Sorry! Your pin is incorrect. Try again ");
        }


    }
}
