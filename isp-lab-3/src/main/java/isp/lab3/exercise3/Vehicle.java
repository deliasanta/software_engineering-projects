package isp.lab3.exercise3;

public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;

    public Vehicle(String model,String type, int speed,char fuelType){
        this.model=model;
        this.type=type;
        this.speed=speed;
        this.fuelType=fuelType;
        numberOfVehicle++;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }

    public char getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return model +
                "(" + type + ")" +
                " speed=" + speed +
                " fuel type=" + fuelType
                ;
    }

    public boolean equals(Vehicle x, Vehicle y){
        if((x.model.equals(y.model))&&(x.type.equals(y.type))&&(x.speed==y.speed)&&(x.fuelType==y.fuelType)) return true;
        else return false;

    }
    private static int numberOfVehicle = 0;

    public static int getNumberOfVehicle() {
        return numberOfVehicle;
    }
}
