package isp.lab4.exercise3;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;
import junit.framework.TestCase;

public class ControlerTest extends TestCase {
    public Controler controler;
    public TemperatureSensor t;
    public FireAlarm f;

    public void setUp(){
        t=new TemperatureSensor(25,"Targu Lapus");
        f=new FireAlarm(false);
        controler=new Controler(t,f);

    }
    public void testControlStep(){
        controler.controlStep();
        assertEquals(false,f.isActive());
    }

}
