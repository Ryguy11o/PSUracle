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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author kylemullen
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({sporcle.AnswerPanelTest.class, sporcle.QuizFrameTest.class, sporcle.ScoreLabelTest.class, sporcle.ControllerTest.class, sporcle.Quiz_timerTest.class, sporcle.UserInputTest.class, sporcle.SporcleTest.class, sporcle.ControlPanelTest.class, sporcle.AnswerLabelTest.class})
public class SporcleSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
