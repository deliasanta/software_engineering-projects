package isp.lab4.exercise6;

public class Employee {
    private String firstName;
    private String lastName;

    public double getPaymentAmount(){
        return 0.0;
    }
    public Employee(){

    }
    public Employee(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
