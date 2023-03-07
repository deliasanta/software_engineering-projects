package isp.lab9.exercise2;

import isp.lab9.exercise2.Observer;

public class AlarmController implements Observer {
    public void update(Object event) {
        System.out.println("Value received from sensor: " +event);
    }
}
