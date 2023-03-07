package isp.lab2;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args){
        int a,b,p=1,k=0,N,s=0,contor=0,j=0;
        float med_geo;
        int[] v= new int[200];
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti intervalul : ");
        a=scan.nextInt();
        b=scan.nextInt();
        System.out.println("Introduceti numarul de numere pentru care sa se faca suma cifrelor: ");
        N=scan.nextInt();
        for(int i=a;i<=b;i++)
            if(testarePrim(i)) {
                p = p * i;
                k++;
                if(k<=N){
                    v[j]=i;
                    j++;
                }

            }
        for(j=0;j<N;j++)
        {
            s=0;
            while(v[j]!=0){
                s=s+v[j]%10;
                v[j]=v[j]/10;
            }
            if(s%2==0)
                contor++;
        }

        med_geo=(float)Math.pow(p,1.0/k);
        System.out.println("Media geometrica este: "+med_geo);
        System.out.println("Numarul de numere prime care au suma cifrelor para este: "+contor);

    }

    static boolean testarePrim (int n)
    {
        if (n < 2)
            return false;
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
