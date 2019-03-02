/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1896052
 */
public class Emp {
    
    public Emp() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Employee() {
        System.out.println("Display Employee Id and Salary");
        double employeeid=123;
        double salary=10000;
        double expecteResult=123+10000;
        double realResult=falconflights.Employee.employee(employeeid,salary);
        assertEquals(expecteResult,realResult,0.1);
    }
}
