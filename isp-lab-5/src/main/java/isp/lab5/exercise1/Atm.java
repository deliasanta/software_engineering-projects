package isp.lab5.exercise1;

public class Atm {
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
