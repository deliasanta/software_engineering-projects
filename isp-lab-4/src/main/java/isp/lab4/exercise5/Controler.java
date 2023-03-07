package isp.lab4.exercise5;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

public class Controler {
    private TemperatureSensor[] temperatureSensors=new TemperatureSensor[3];
    private FireAlarm fireAlarm;

    public Controler(){
        this.fireAlarm=new FireAlarm(true);
        this.temperatureSensors[0]=new TemperatureSensor(52,"Tragu Lapus");
        this.temperatureSensors[1]=new TemperatureSensor(20,"Sighisoara");
        this.temperatureSensors[2]=new TemperatureSensor(21,"Iclod");
    }

    public FireAlarm getFireAlarm() {
        return fireAlarm;
    }

    public void controlStep(){
        int k=0;
        for(int i=0;i<temperatureSensors.length;i++){
            if(temperatureSensors[i].getValue()>50){
                k=1;
            }
        }
        if(k==1)
        {
            fireAlarm.setActive(true);
            System.out.println("Fire alarm started");
        }
        else
            System.out.println("Fire alarm not started");
    }
}
