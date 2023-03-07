package isp.lab6.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

enum SensorType{
    TEMP, PRES;
}
/////////////////////////////////////////
class SensorReading implements Comparable<SensorReading>{
    double value;
    long dateAndTime;

    public SensorReading(double value, long dateAndTime) {
        this.value = value;
        this.dateAndTime = dateAndTime;
    }

    @Override
    public int compareTo(SensorReading o) {
        return (int)(value-o.value);
    }
}
/////////////////////////////////////////
class Sensor implements Comparator<SensorReading>{
    ArrayList<SensorReading> readings = new ArrayList<>();
    String id;
    SensorType type;

    public int compare(SensorReading o1, SensorReading o2) {
        if (o1.dateAndTime > o2.dateAndTime)
            return 1;
        if (o1.dateAndTime < o2.dateAndTime)
            return -1;
        return 0;
    }

    public Sensor(String id, SensorType type) {
        this.id = id;
        this.type = type;
    }

    public boolean addSensorReading(SensorReading reading){
        readings.add(reading);
        return true;
    }

    List<SensorReading> getSensorReadingSortedByValue(){
        Collections.sort(readings );
        return readings;
    }

    List<SensorReading> getSensorReadingSortedByDateAndTime(Sensor s1){
        Collections.sort(readings,s1);
        return readings;
    }


}
/////////////////////////////////////////
class SensorCluster{
    ArrayList<Sensor> sensors = new ArrayList<>();


    public Sensor addSensor(String id, SensorType type){
        for(Sensor i:sensors)
            if(i.id.equals(id))
                return null;
        Sensor sensor = new Sensor(id,type);
        sensors.add(sensor);
        return sensor;
    }

    public boolean writeSensorReading(String id, double value, long dtaeTime){
        for(Sensor s: sensors){
            if(s.id.equals(id)){
                s.addSensorReading(new SensorReading(value,dtaeTime));
                return true;
            }
        }
        return false;
    }

    public Sensor getSensorById(String id){
        return sensors.stream().filter(s -> s.id==id).findFirst().get();
    }

}
/////////////////////////////////////////
public class Exercise3 {

    public static void main(String[] args) {
        SensorCluster c = new SensorCluster();
        c.addSensor("1",SensorType.TEMP);
        SensorCluster cc = new SensorCluster();
        cc.addSensor("2",SensorType.PRES);
        System.out.println("The sensor has the adress:");
        Sensor c1=c.addSensor("5",SensorType.TEMP);
        c.writeSensorReading("1",1,91);
        c.writeSensorReading("1",7,92);
        c.writeSensorReading("1",5,93);
        c.writeSensorReading("1",2,19);

        cc.writeSensorReading("2",8,85);
        cc.writeSensorReading("2",4,86);
        cc.writeSensorReading("2",1,94);
        cc.writeSensorReading("2",2,19);

        System.out.println(c1);
        Sensor s1 = c.getSensorById("1");
        Sensor s2 =cc.getSensorById("2");
        List<SensorReading> rez = s1.getSensorReadingSortedByValue();
        List<SensorReading> rez2 = s2.getSensorReadingSortedByDateAndTime(s1);
        System.out.println("The readings sorted by values for the sensor are : ");
        rez.stream().forEach(s -> System.out.println(s.value));
        System.out.println("The readings sorted by dates and times for the sensor are: ");
        rez2.stream().forEach(s -> System.out.println(s.dateAndTime));


       // for(SensorReading s: rez){
          // System.out.println(s.value);
      //}


    }
}
