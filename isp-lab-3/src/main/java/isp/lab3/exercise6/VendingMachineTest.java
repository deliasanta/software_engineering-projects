package isp.lab3.exercise6;

public class VendingMachineTest {
    public static void main(String[] args){

        VendingMachine v= VendingMachine.getInstance();
        v.insertCoins(20);
        v.displayCredit();
        v.displayProducts();
        System.out.println(v.selectProduct(4));

    }
}
