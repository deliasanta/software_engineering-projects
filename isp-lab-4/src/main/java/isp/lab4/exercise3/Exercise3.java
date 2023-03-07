package isp.lab4.exercise3;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

public class Exercise3 {
    public static void main(String[] args)
    {
        TemperatureSensor t=new TemperatureSensor(20,"Targu Lapus");
        FireAlarm f=new FireAlarm(true);
        Controler c=new Controler(t,f);
        c.controlStep();
    }

}
