package isp.lab4.exercise2;

import isp.lab4.exercise1.TemperatureSensor;
import junit.framework.TestCase;

public class FireAlarmTest extends TestCase {

    public FireAlarm alarm;
    public void setUp(){
        alarm = new FireAlarm(true);

    }

    public void testActive(){
        assertEquals(true,alarm.isActive());
    }

}
