package isp.lab4.exercise4;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

import junit.framework.TestCase;

public class ControlerTest extends TestCase {
    public TemperatureSensor[] temperatureSensors;
    public FireAlarm alarm;
    public Controler controler;

    public void setUp(){
        temperatureSensors=new TemperatureSensor[3];
        temperatureSensors[0]=new TemperatureSensor(51,"Tragu Lapus");
        temperatureSensors[1]=new TemperatureSensor(55,"Sighisoara");
        temperatureSensors[2]=new TemperatureSensor(56,"Iclod");

        alarm=new FireAlarm(true);
        controler=new Controler(temperatureSensors,alarm);

    }

    public void testControlStep(){
        controler.controlStep();
        assertTrue(alarm.isActive());
    }
}
