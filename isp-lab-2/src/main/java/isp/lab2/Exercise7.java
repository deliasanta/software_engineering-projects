package isp.lab2;
import java.util.Random;
import java.util.Scanner;
public class Exercise7 {
    public static void guessingGame(int x){
        int contor=0;

        Scanner scan= new Scanner(System.in);
        int[] v=new int[100];

        for(int i=0;i<100;i++){
            int y = scan.nextInt();
            v[i]=y;
            if(v[i]==x){
                System.out.println("Raspuns corect! BRAVO");
                contor++;
                break;
            }
            else{
                if(v[i]<x){
                    System.out.println("Raspuns gresit, numarul este prea mic");
                    contor++;

                }
                if(v[i]>x){
                    System.out.println("Raspuns gresit, numarul tau este prea mare");
                    contor++;
                }
            }
        }

        int copie=contor;
        for(int i=0;i<contor;i++){
            if (v[i]==v[i+1])
                copie--;
        }
        System.out.println(copie);

    }
    public static void main(String[] args) {
        Random rand =new Random();
        int rand_nr1 = rand.nextInt(100);
        guessingGame(rand_nr1);
    }
}
