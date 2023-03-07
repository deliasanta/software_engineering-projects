package isp.lab2;

public class Exercise4 {

    public static void main(String[] args){
        int[] v={1,5,4,9,3,22,9,24,66};
        int par=0,impar=0,prim=0;
        for(int i=0;i<v.length;i++) {
            if (v[i] % 2 == 0 && par<1) {
                par++;
                System.out.println("Primul numar par din vector este: "+v[i]+" si se afla pe pozitia"+i);
            }
            if(v[i]%2==1 && impar<1){
                impar++;
                System.out.println("Primul numar impar din vector este: "+v[i]+" si se afla pe pozitia"+i);
            }
            if(testarePrim(v[i])&& prim<1){
                prim++;
                System.out.println("Primul numar prim din vector este: "+v[i]+" si se afla pe pozitia"+i);
            }

        }
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
