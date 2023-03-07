package isp.lab3.exercise5;

public class Exercise5 {
    public static void main(String[] args){
        String[] products={"Apa", "Suc","Cafea","Ceai","Ciocolata calda","Latte","Capuccino"};
        VendingMachine v1=new VendingMachine(10,products);
        v1.userMenu();
    }
}
