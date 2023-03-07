package isp.lab4.exercise1;

//import isp.lab4.exercise0.CarAlarm; //NU ASA

public class Exercise1 {

    public static void main(String[] args) {
        //instantiati obiect
        TemperatureSensor t=new TemperatureSensor(20,"Targu Lapus");
        System.out.println("Valoarea temperaturii este : "+t.getValue()+"i n localitatea "+t.getLocation());
        System.out.println(t.toString());
    }
}
