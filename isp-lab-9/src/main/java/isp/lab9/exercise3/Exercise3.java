/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;




/**
 *
 * @author mihai.hulea
 */
public class Exercise3 extends JPanel {




    public static void main(String[] args) throws Exception {
        System.out.println("It works.");
        JFrame frame = new JFrame ("Access Door");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JLabel l = new JLabel ("type access code: ");
        JTextField tf = new JTextField(7);
        JTextField status = new JTextField(10);
        panel1.add(l);
        panel1.add(tf);
        panel1.setLayout(new FlowLayout());

        JButton b1 = new JButton("Enter PIN");
        panel2.add(b1);
        panel2.add(status);


        panel3.setLayout(new FlowLayout());
        panel3.add(new JLabel("Door status"));
        panel3.add(status);

        JPanel p = new JPanel();
        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        frame.setContentPane(p);
        frame.setVisible(true);

        ControllerInterface ctrl=new DoorLockController(new Door(), new ArrayList<>());
        ctrl.addTenant("12345", "User1");

       // System.out.println(ctrl.enterPin("1234"));



        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pin= tf.getText();
                try {
                   DoorStatus doorStatus= ctrl.enterPin(pin);
                   status.setText(doorStatus.toString());
                } catch (Exception ex) {
                    ex.printStackTrace();
                    status.setText(ex.getMessage());
                }

            }
        });


        }

        //

}
 

