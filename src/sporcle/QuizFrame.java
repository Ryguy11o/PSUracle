/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sporcle;

import javax.swing.JFrame;
import java.awt.GridLayout;

/**
 *
 * @author Ryan
 */
class QuizFrame extends JFrame {
    private ControlPanel control_panel;
    private AnswerPanel answer_panel;
    public QuizFrame(String name) {
        super(name);
        answer_panel = new AnswerPanel();
         control_panel = new ControlPanel(answer_panel);
        this.setLayout(new GridLayout(2,1));
        add(control_panel);
        add(answer_panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        setSize (700, 500);
        setVisible(true);
    }
    
}
