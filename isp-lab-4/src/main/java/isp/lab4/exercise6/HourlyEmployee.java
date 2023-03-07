package isp.lab4.exercise6;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName,double wage,double hours){
        super(firstName,lastName);
        this.hours=hours;
        this.wage=wage;
    }
    @Override
    public double getPaymentAmount() {
        return 20.50;
    }
}
