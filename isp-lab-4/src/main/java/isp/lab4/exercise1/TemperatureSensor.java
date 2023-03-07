package isp.lab4.exercise1;

public class TemperatureSensor {

    //atribute
    private int value;
    private String location;

    //constructori
    TemperatureSensor(){

    }
    public TemperatureSensor(int type, String location){
        this.value=type;
        this.location=location;
    }
    //metode

    public int getValue() {
        return value;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "value=" + value +
                ", location='" + location + '\'' +
                '}';
    }
}
