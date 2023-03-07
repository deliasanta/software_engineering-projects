package isp.lab4.exercise6;

import junit.framework.TestCase;

public class ComissionEmployeeTest extends TestCase {
    public ComissionEmployee c;

    public void setUp(){
        c=new ComissionEmployee("Diana","Dobocan",4.5,5);
    }

    public void testGetPaymentAmount(){
        assertEquals(0.0,c.getPaymentAmount());
    }
}
