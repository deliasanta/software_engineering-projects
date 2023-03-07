package isp.lab2;

public class Exercise6 {

    static void nerecursivitate(int n) {
        int[] v = new int[n];
        int f1 = 1, f2 = 2;
        if (n < 1)
            return;
        v[0] = f1;
        v[1] = f2;
        for (int i = 2; i < n; i++) {
            v[i] = f1 * f2;
            f1 = f2;
            f2 = v[i];
        }
        for (int i = 0; i < v.length; i++)
            System.out.print(v[i] + " ");
    }


    public static void main(String[] args) {
        nerecursivitate(8);

    }
}
