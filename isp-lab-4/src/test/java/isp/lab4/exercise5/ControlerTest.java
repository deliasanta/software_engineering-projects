package isp.lab4.exercise5;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

import junit.framework.TestCase;

public class ControlerTest extends TestCase {
    public Controler controler;

    public void setUp(){

        controler=new Controler();

    }

    public void testControlStep(){
        controler.controlStep();
        assertTrue(controler.getFireAlarm().isActive());
    }
}

