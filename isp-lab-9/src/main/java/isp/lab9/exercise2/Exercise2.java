/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab9.exercise2;

/**
 *
 * @author Admin
 */
public class Exercise2 {
     public static void main(String[] args) throws InterruptedException {
         Sensor temperature = new Sensor("TEMPERATURE");
         Sensor humidity = new Sensor("HUMIDITY");
         Sensor pressure = new Sensor("PRESSURE");
         AlarmController controller=new AlarmController();
         temperature.register(controller);
         humidity.register(controller);
         pressure.register(controller);
         temperature.readSensor();
         Thread.sleep(500);
         humidity.readSensor();
         Thread.sleep(500);
         pressure.readSensor();
         Thread.sleep(500);

         System.out.println("It works!");
    }
}
