package isp.lab3.exercise1;

public class TreeTest {
    public static void main(String[] args){
        Tree test1= new Tree();
        Tree test2= new Tree();
        Tree test3= new Tree();
        test1.grow(10);
        System.out.println(test1.toString());
        test2.grow(20);
        System.out.println(test2.toString());
        test3.grow(30);
        System.out.println(test3.toString());
    }
}
