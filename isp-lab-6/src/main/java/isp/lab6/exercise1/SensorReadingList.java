package isp.lab6.exercise1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
public class SensorReadingList implements IReadingRepository{

    private List<SensorReading> sensorList=new ArrayList<SensorReading>();
    public void addReading(SensorReading reading){
        sensorList.add(reading);
    }

    public double getAvarageValueByType(Type type, String location){
        int s=0,count=0;
        for(SensorReading i:sensorList){
            if (type==i.getType() && location.equals(i.getLocation())) {
                s += i.getValue();
                count++;
            }
        }
        return (double)s/count;
    }
    public List<SensorReading> getReadingsByType(Type type){
        List<SensorReading> sensorListOfType=new ArrayList<SensorReading>();
        for(SensorReading i:sensorList)
            if(type==i.getType())
                sensorListOfType.add(i);
        return sensorListOfType;
    }

    public void listSortedByLocation(){
        sensorList.sort((o1, o2) -> {
            return Integer.valueOf(o1.getLocation().compareTo(o2.getLocation()));

        });
        System.out.println(sensorList);
    }
    public void listSortedByValue(){
        Collections.sort(sensorList, new Comparator<SensorReading>() {
            public int compare(SensorReading o1, SensorReading o2) {
                if (o1.getValue() > o2.getValue())
                    return 1;
                if (o1.getValue() < o2.getValue())
                    return -1;
                return 0;
            }
        });
        System.out.println(sensorList);
    }

    public List<SensorReading> findAllByLocationAndType(String location, Type type){
        List<SensorReading> sensorListOfLocAndTy=new ArrayList<SensorReading>();
        for(SensorReading i:sensorList)
            if(type==i.getType() && location.equals(i.getLocation()))
                sensorListOfLocAndTy.add(i);
        return sensorListOfLocAndTy;
    }
}
