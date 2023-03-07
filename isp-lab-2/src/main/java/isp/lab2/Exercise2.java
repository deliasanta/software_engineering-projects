package isp.lab2;

import java.util.Scanner;


public class Exercise2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti cuvintele separate prin virgula: ");
        String linie=scan.nextLine();
        System.out.println("Introduceti caracterul: ");
        char prima_litera=scan.next().charAt(0);
        String[] cuvant=linie.split(",");
        System.out.println("Cuvintele care incep cu litera "+prima_litera+" sunt");
        for(int i=0;i<cuvant.length;i++)
            if(cuvant[i].charAt(0)==prima_litera)
                System.out.print(cuvant[i]+" ");

    }
}
