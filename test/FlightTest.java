/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Time;
import java.text.DateFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 1893541
 */
public class FlightTest {
   Calendar cal = Calendar.getInstance();
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	
    public FlightTest() {
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
     public void testingFlight(){
        System.out.println("Testing the method  Flight of class Flight");
        String Id="1893541";
        String origin="Montreal";
        String destination="India";
        Date date=new Date();
        String dt=date.toString();
       // Time time=new Time();
        String expectedResult="1893541"+ "Montreal"+"India"+dt;
        String realResult=falconflights.Flight.DisplayFlight(Id,origin,destination,new Date());
        assertEquals(expectedResult,realResult);
     }
     
    // public void hello() {}
}
