package isp.lab4.exercise3;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

public class Controler {
    private TemperatureSensor temperatureSensor;
    private FireAlarm fireAlarm;

    public void controlStep(){
        if(temperatureSensor.getValue()>50){
            fireAlarm.setActive(true);
            System.out.println("Fire alarm started");
        }
        else
            System.out.println("Fire alarm not started");

    }
    public Controler(TemperatureSensor temperatureSensor, FireAlarm fireAlarm)
    {
        this.temperatureSensor=temperatureSensor;
        this.fireAlarm=fireAlarm;
    }

}
