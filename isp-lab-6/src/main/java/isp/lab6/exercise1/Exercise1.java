package isp.lab6.exercise1;

import java.util.Collections;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Test implementation here.");
        SensorReadingList list1=new SensorReadingList();
        SensorReading sensor1=new SensorReading(22,"Cluj",Type.TEMPERATURE);
        SensorReading sensor2=new SensorReading(23,"Alba",Type.TEMPERATURE);
        SensorReading sensor3=new SensorReading(20,"Danesti",Type.TEMPERATURE);
        list1.addReading(sensor1);
        list1.addReading(sensor2);
        list1.addReading(sensor3);
        System.out.println("Average of reading: "+list1.getAvarageValueByType(Type.TEMPERATURE,"Cluj"));
        System.out.println("Readings by type are"+list1.getReadingsByType(Type.TEMPERATURE).toString());
        System.out.println("Sorted list by location: ");
        list1.listSortedByLocation();
        System.out.println("Sorted list by value: ");
        list1.listSortedByValue();
        System.out.println("Readings by location and type: "+list1.findAllByLocationAndType("Cluj",Type.TEMPERATURE).toString());
    }
}
