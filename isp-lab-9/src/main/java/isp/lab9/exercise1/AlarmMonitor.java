package isp.lab9.exercise1;

public class AlarmMonitor implements Observer {

    public void update(Object event) {
        System.out.println("Alarm status has changed!");
        System.out.println("Received event: Event class:"+event.getClass()+":"+event.toString());

    }
}
