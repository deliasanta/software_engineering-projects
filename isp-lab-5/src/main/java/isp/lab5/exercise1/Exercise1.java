package isp.lab5.exercise1;


import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Card card1=new Card("123456","1234");
        Card card2=new Card("345621","1111");
        Card card3=new Card("564321","2323");
        Account[] account=new Account[10];
        account[0]=new Account("Malinas Tersinio",5200,card1);
        account[1]=new Account("Pasca Stefan",1200,card2);
        account[2]=new Account("Boca Cristian",756,card3);

        Bank BRD=new Bank(account);

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

