package isp.lab2;
import java.util.Random;
public class Exercise5 {
    public static int generareRandom(Random n) {
        int x = -1000;
        int y = 1000;
        int result = n.nextInt(y - x) + x;
        return result;
    }
    public static void bubbleSort(int v[])
    {
        int i, j,aux=0;
        for (i = 0; i <v.length-1; i++)
            for (j = 0; j < v.length-i-1; j++)
                if (v[j] > v[j+1])
                {
                    aux=v[j];
                    v[j]=v[j+1];
                    v[j+1]=aux;
                }
    }
    public static void main(String[] args) {
        Random n = new Random();
        int[] v=new int[20];
        System.out.print("Vectorul generat este: ");
        for(int i=0;i<v.length;i++) {
            v[i]=generareRandom(n);
            System.out.print(v[i]+" ");
        }
        bubbleSort(v);
        System.out.println();
        System.out.print("Vectorul sortat este: ");
        for(int i=0;i<v.length;i++) {
            System.out.print(v[i]+" ");
        }

    }
}
