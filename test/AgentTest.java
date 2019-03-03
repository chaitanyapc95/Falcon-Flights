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
public class AgentTest {
    
    public AgentTest() {
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
    // @Test
    // public void hello() {}
    @Test
    public void testingAgent(){
            String Id="";
            Date date=new Date();
            String y=date.toString();
            y=y.toUpperCase();
            String expect="19-MAR-O-XX";
            char c=falconflights.Agent.dateType(y);
            String real=falconflights.Agent.generateID(Id,y, c);
            assertEquals(expect,real);
    }
}
