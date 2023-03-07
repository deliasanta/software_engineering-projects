package isp.lab6.exercise3;

import junit.framework.TestCase;

public class SensorClusterTest extends TestCase {
    SensorCluster c;
    public void setUp(){
         c = new SensorCluster();
         c.addSensor("1",SensorType.TEMP);

    }
    public void testAddSensor(){
        assertNull(c.addSensor("1",SensorType.PRES));
    }
    public void testWriteSensorReading(){
        assertTrue(c.writeSensorReading("1",5,95));
    }

    public void testGetSensorById(){
        Sensor s = c.addSensor("2", SensorType.TEMP);
        Sensor foundSensor = c.getSensorById("2");
        assertEquals(s,foundSensor);
    }


}
