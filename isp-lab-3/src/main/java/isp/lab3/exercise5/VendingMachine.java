package isp.lab3.exercise5;
import java.util.Scanner;
public class VendingMachine {
    private  int credit;
    private final String[] products;

    public VendingMachine(int credit,String[] products){
        this.credit=credit;
        this.products=products;
    }
    public  void displayProducts(){
        for(int i=0;i<products.length;i++)
            System.out.println("Produsul "+i+"."+products[i]);
    }

    public void insertCoins(int value){
        this.credit+=value;
    }

    public String selectProduct(int id){
        for(int i=0;i<products.length;i++) {
            if (id == i)
                return "Ati ales produsul " + products[i];
        }
        return "Eroare la alegerea produsului. Alegeti un produs care este disponibil!";
    }

    public void displayCredit(){
        System.out.println("Credit valabil: "+credit);
    }
    public void userMenu(){
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Meniu");
            System.out.println("1. Lista produse.");
            System.out.println("2. Selectare produs.");
            System.out.println("3. Introduceti credit.");
            System.out.println("4. Vizualizare credit disponibil.");
            System.out.println("5. Exit");

            String optiuni = s.nextLine();

            switch (optiuni) {
                case "1":
                    this.displayProducts();
                    break;
                case "2":
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Selectati produsul dorit: ");
                    int n=scan.nextInt();
                    System.out.println(this.selectProduct(n));
                    break;
                case "3":
                {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Introduceti credit: ");
                    int x=scanner.nextInt();
                    this.insertCoins(x);
                    break;}
                case "4":
                    this.displayCredit();
                    break;
                case "5":
                    s.close();
                    break;

            }
        }
    }
}
