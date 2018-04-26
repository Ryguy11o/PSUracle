/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sporcle;

import java.awt.Color;
import javax.swing.JLabel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kylemullen
 */
public class AnswerLabelTest {
    
    public AnswerLabelTest() {
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
     * Test of showAnswer method, of class AnswerLabel.
     */
    @Test
    public void testShowAnswer() {
        System.out.println("showAnswer");
        AnswerLabel instance = new AnswerLabel("1", "Test");
        instance.showAnswer();
        JLabel test = new JLabel();
        test.setBackground(Color.white);
        Assert.assertEquals("Failed to show all answers",instance.getBackground(), test.getBackground());
        
    }
    
}
