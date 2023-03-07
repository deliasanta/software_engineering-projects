package isp.lab3.exercise5;

public class VendingMachineTest {
    public static void main(String[] args){
        String[] products={"Apa", "Suc","Cafea","Ceai","Ciocolata calda","Latte","Capuccino"};
        VendingMachine v=new VendingMachine(10,products);
        v.insertCoins(20);
        v.displayCredit();
        v.displayProducts();
        System.out.println(v.selectProduct(4));



    }

}
