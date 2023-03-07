package isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String[] args){
        ComissionEmployee c=new ComissionEmployee("Diana","Dobocan",4.5,5);
        HourlyEmployee h=new HourlyEmployee("Andreea","Todea",2000,8);
        SalariedEmployee s=new SalariedEmployee("Delia","Santa",600);
        System.out.println(c.getPaymentAmount());
        System.out.println(h.getPaymentAmount());
        System.out.println(s.getPaymentAmount());

        Employee[] e=new Employee[6];
        e[0]=new ComissionEmployee("Diana","Dobocan",4.5,5);
        e[1]=new ComissionEmployee("Ana","Pop",5.5,4);

        e[2]=new HourlyEmployee("Florina","Popescu",1500,5);
        e[3]=new HourlyEmployee("Ana","Popescu",2000,4);

        e[4]=new SalariedEmployee("Andreea","Todea",120);
        e[5]=new SalariedEmployee("Stefan","Pasca",200);

        double suma=0;
        for(int i=0;i<6;i++){
            suma=suma+e[i].getPaymentAmount();
        }
        System.out.println("Total payment "+suma);


    }
}
