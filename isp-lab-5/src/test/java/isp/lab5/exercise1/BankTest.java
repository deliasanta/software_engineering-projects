package isp.lab5.exercise1;

import junit.framework.TestCase;

public class BankTest extends TestCase {

    public Account[] accounts;
    public Bank bank;
    public Card card1;

    public void setUp() {
        card1 = new Card("123456", "1234");

        accounts = new Account[10];
        accounts[0] = new Account("Malinas Tersinio",5200,card1);


        bank = new Bank(accounts);
    }

    public void testGetAccountByCardId(){
        assertEquals(accounts[0],bank.getAccountByCardId("123456"));
    }
}
