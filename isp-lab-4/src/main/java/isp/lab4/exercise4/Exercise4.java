package isp.lab4.exercise4;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;


public class Exercise4 {
    public static void main(String[] args){
         FireAlarm f=new FireAlarm(false);
         TemperatureSensor[] temperatureSensors=new TemperatureSensor[3];
         temperatureSensors[0]=new TemperatureSensor(51,"Tragu Lapus");
         temperatureSensors[1]=new TemperatureSensor(55,"Sighisoara");
         temperatureSensors[2]=new TemperatureSensor(56,"Iclod");
         Controler c=new Controler(temperatureSensors,f);
         c.controlStep();
    }

}
