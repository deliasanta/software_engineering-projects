package isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args){
        FireAlarm alarm1=new FireAlarm(true);
        alarm1.setActive(true);
        alarm1.isActive();
        System.out.println(alarm1.toString());
    }
}
