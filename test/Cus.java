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
public class Cus {
    
    public Cus() {
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
     public void cus() {
         System.out.println("Customer address and passport");
     String address="2155 Ave VanHorne Montreal";
     String passport="N1234567";
        String expectedResult = "2155 Ave VanHorne Montreal"+"N1234567";
        //String realResult=falconflights.Customer(address,passport);
        // assertEquals(expectedResult, realResult);
        
     
     }
}
