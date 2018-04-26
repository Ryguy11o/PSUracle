/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sporcle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kylemullen
 */
public class ScoreLabelTest {
    
    public ScoreLabelTest() {
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
     * Test of increaseScore method, of class ScoreLabel.
     */
    @Test
    public void testIncreaseScore() {
        System.out.println("Testing method increaseScore");
        ScoreLabel instance = new ScoreLabel(10);
        int expectedScore = 8;
        for(int i = 0; i < expectedScore; i++){
            instance.increaseScore();
        }
        assertEquals("The score board failed to increase", expectedScore, instance.score);
    }
    
    public void testScoreCompleted() {
        System.out.println("Testing method increaseScore");
        ScoreLabel instance = new ScoreLabel(10);
        String expectedMessage = "Congradulations you win!!";
        int score = 10;
        for(int i = 0; i < score; i++){
            instance.increaseScore();
        }
        assertEquals("The score board failed to show message", expectedMessage, instance.score);
    }
    
}
