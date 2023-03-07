package isp.lab2;
import java.util.Random;
import java.util.Scanner;
public class Exercise1 {
    public static int generareRandom(Random n){
        int x = 2;
        int y = 10;
        int result = n.nextInt(y-x) + x;
        return result;
    }
    public static void citireVector(int x){
        Scanner scan = new Scanner(System.in);
        float m=0;
        int s=0;
        int[] v=new int[x];
        for(int i=0;i<x;i++) {
            System.out.println("v["+i+"]=");
            v[i] = scan.nextInt();
            s=s+v[i];
        }
        m=(float)s/x;
        System.out.println("Media aritmetica este: "+m);
    }

    public static void main(String[] args){
        Random n=new Random();
        int result=generareRandom(n);
        System.out.println("Numarul generat este: " +result) ;
        citireVector(result);
    }

}
