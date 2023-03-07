package isp.lab5.exercise1;

public class Bank {
    private Account[] accounts=new Account[10];

    public Bank(Account[] accounts){
        for(int i=0;i<accounts.length;i++)
            this.accounts[i]=accounts[i];
    }
    public String executeTransaction(Transaction t){
        return t.execute();
    }

    public Account getAccountByCardId(String cardId){
        for(int i=0;i<accounts.length;i++)
        {
            if(accounts[i].getCardClient().getCardId().equals(cardId))
                return accounts[i];
        }
        return null;
    }

}
