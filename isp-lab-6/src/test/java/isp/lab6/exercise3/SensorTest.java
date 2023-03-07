package isp.lab6.exercise3;

import junit.framework.TestCase;

import java.util.List;
import java.util.ArrayList;

public class SensorTest extends TestCase {

    public Sensor sensor;
    public SensorReading sensorR;
    public SensorReading sensorR1;
    public SensorCluster c;

     public void setUp(){
         sensor=new Sensor("1",SensorType.PRES);
         sensorR=new SensorReading(25,95);
         sensorR1=new SensorReading(30,96);
         sensor.addSensorReading(sensorR);
         sensor.addSensorReading(sensorR1);



     }

     public void testAddSensorReading(){
         assertTrue(sensor.addSensorReading(sensorR));
     }

     public void testCompare(){
         assertEquals(-1,sensor.compare(sensorR,sensorR1));
     }

     public void testGetSensorReadingSortedByValue(){

     }
}
