package isp.lab5.exercise1;

import junit.framework.TestCase;

public class AtmTest extends TestCase {

    public Account[] accounts;
    public Bank bank;
    public Card card1;
    public Atm atm;

    public void setUp(){
        card1=new Card("123456","1234");

        accounts=new Account[10];
        accounts[0]=new Account("Malinas Tersinio",5200,card1);


        bank=new Bank(accounts);
        atm = new Atm(bank,card1);

    }

    public void testChangePin(){
        atm.changePin("1234","5454");
        assertEquals("5454",bank.getAccountByCardId(card1.getCardId()).getCardClient().getPin());
    }

    public void testWithdraw(){
        atm.withdraw(20);
        assertEquals(5180.0,bank.getAccountByCardId(card1.getCardId()).getBalance());
    }

    public void testInsertCard(){
        assertTrue(atm.insertCard(card1,"1234"));
    }
}
