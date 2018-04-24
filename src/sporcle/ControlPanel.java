/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sporcle;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Ryan
 */
class ControlPanel extends JPanel {

    public ControlPanel() {
        this.setBackground(Color.white);
        this.setLayout(new GridLayout(3,3));
        this.add(new JLabel("Title of Quiz"));
        this.add(new AnswerLabel(""));
        this.add(new AnswerLabel(""));
        this.add(new UserInput());
        this.add(new ScoreLabel("0/10"));
        this.add(new Quiz_timer(60));
        this.add(new AnswerLabel(""));
        this.add(new AnswerLabel(""));
        this.add(new AnswerLabel(""));
    }
    
}
