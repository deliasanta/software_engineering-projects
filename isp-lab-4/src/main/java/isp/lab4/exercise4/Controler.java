package isp.lab4.exercise4;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

public class Controler {
    private  TemperatureSensor temperatureSensors[]=new TemperatureSensor[3];
    private FireAlarm fireAlarm;
    int k=0;
    public void controlStep(){
        for(int i=0;i<temperatureSensors.length;i++){
            if(temperatureSensors[i].getValue()>50){
                k++;
            }
        }
        if(k==3)
        {
            fireAlarm.setActive(true);
            System.out.println("Fire alarm started");
        }
        else
            System.out.println("Fire alarm not started");

    }

    public Controler(TemperatureSensor[] temperatureSensors, FireAlarm fireAlarm)
    {
        for(int i=0;i<3;i++) {
            this.temperatureSensors[i] = temperatureSensors[i];
        }
        this.fireAlarm=fireAlarm;
    }


}
