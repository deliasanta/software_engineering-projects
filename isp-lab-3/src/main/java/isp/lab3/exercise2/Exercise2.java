package isp.lab3.exercise2;

public class Exercise2 {
    public static void main(String[] args){
        Rectangle r=new Rectangle(2,1,"black");

        System.out.println("The rectangle has the length: "+r.getLength());
        System.out.println("The rectangle has the width: "+r.getWidth());
        System.out.println("The rectangle has the color: "+r.getColor());
        System.out.println("The rectangle has the area: "+r.getArea());
        System.out.println("The rectangle has the perimeter : "+r.getPerimeter());

    }
}
