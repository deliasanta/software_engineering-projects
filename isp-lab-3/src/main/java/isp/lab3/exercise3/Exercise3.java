package isp.lab3.exercise3;

public class Exercise3 {
    public static void main(String[] args){
        Vehicle v1=new Vehicle("Opel","Corsa",220,'D');
        Vehicle v2=new Vehicle("Ford","Focus",300,'D');

        v1.setModel("BMW");
        System.out.println(v1.getModel());

        v1.setType("Seria 5");
        System.out.println(v1.getType());

        v2.setSpeed(360);
        System.out.println(v2.getSpeed());

        v2.setFuelType('B');
        System.out.println(v2.getFuelType());

        System.out.println(v2.equals(v1,v2));
        System.out.println("We've created " + Vehicle.getNumberOfVehicle() + " vehicles.");
    }
}
