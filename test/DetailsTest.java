/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1893541
 */
public class DetailsTest {
    
    public DetailsTest() {
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
 @Test
    public void testingDetails(){
            String Id="";
            Date date=new Date();
            String y=date.toString();
            y=y.toUpperCase();
            String expect="19-MAR-O-XX";
            char c=falconflights.Details.dateType(y);
            String real=falconflights.Details.generateID(Id,y, c);
            assertEquals(expect,real);
    }
}
