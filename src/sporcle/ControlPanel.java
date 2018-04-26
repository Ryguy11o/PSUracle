/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sporcle;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Ryan
 */
class ControlPanel extends JPanel {
    public ScoreLabel sc;
    public ControlPanel(AnswerPanel answer_panel) {
        UserInput user_input = new UserInput(answer_panel);
        this.setBackground(Color.white);
        this.setLayout(new GridLayout(3,3));
        JLabel title = new JLabel("Penn State Bars", JLabel.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 27));
        this.add(new AnswerLabel("","", this));
        this.add(title);
        this.add(new AnswerLabel("","", this));
        this.add(user_input);
        sc = new ScoreLabel(10);
        this.add(sc);
        
        this.add(new Quiz_timer(60, answer_panel));
        this.add(new AnswerLabel("","", this));
        this.add(new AnswerLabel("","", this));
        this.add(new AnswerLabel("","", this));
        
        
    }
    
}
