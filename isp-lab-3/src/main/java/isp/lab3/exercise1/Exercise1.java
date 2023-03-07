package isp.lab3.exercise1;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        Tree t= new Tree();
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        t.grow(m);
        System.out.println(t.toString());
    }

}
