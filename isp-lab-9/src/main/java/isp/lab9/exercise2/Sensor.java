package isp.lab9.exercise2;

import java.util.Random;

public class Sensor extends Observable{
    String type;

    public Sensor(String type){
        this.type=type;
    }

    public void readSensor() {
        Random rand = new Random();
        int randomValue= rand.nextInt(100);
        this.changeState(randomValue);
    }
}
