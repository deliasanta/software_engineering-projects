package isp.lab9.exercise1;

public class AlarmController implements Observer{
    public void update(Object event) {
        System.out.println("Sending SMS message to owner.");
        //System.out.println("Received event: Event class:"+event.getClass()+":"+event.toString());

    }
}
