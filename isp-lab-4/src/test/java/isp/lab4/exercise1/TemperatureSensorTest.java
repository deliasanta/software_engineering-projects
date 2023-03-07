package isp.lab4.exercise1;

import junit.framework.TestCase;

public class TemperatureSensorTest extends TestCase {

    public TemperatureSensor sensor;
    public void setUp(){
        sensor = new TemperatureSensor(23,"Cluj");

    }
    public void testLocation(){
       assertEquals("Cluj",sensor.getLocation());
    }

    public void testType(){
        assertTrue(23 == sensor.getValue());
    }


}
