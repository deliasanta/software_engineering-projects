package isp.lab6.exercise3;

import junit.framework.TestCase;

public class SensorReadingTest extends TestCase {
    SensorCluster c;
    SensorReading sensorR;
    SensorReading sensorR1;
    public void setUp(){
        sensorR=new SensorReading(25,95);
        sensorR1=new SensorReading(20,85);
    }

    public void testCompareTo(){
        assertEquals(5,sensorR.compareTo(sensorR1));
    }

}
