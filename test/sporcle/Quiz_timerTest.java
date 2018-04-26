/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sporcle;

import java.util.Timer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author kylemullen
 */
public class Quiz_timerTest {
    
    public Quiz_timerTest() {
        int time;
        Timer t;
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

    /**
     * Test of setMinutesAndSeconds method, of class Quiz_timer.
     */
    @Test
    public void testSetMinutesAndSeconds() {
        System.out.println("setMinutesAndSeconds");
        Quiz_timer instance = null;
        instance.setMinutesAndSeconds();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTime method, of class Quiz_timer.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        Quiz_timer instance = new Quiz_timer(0);
        instance.setTime();        
        
    }
    
}
