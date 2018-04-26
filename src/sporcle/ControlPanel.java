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

    public ControlPanel(AnswerPanel answer_panel) {
        UserInput user_input = new UserInput(answer_panel.list);
        this.setBackground(Color.white);
        this.setLayout(new GridLayout(3,3));
        JLabel title = new JLabel("Penn State Bars", JLabel.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 27));
        this.add(new AnswerLabel("",""));
        this.add(title);
        this.add(new AnswerLabel("",""));
        this.add(user_input);
        this.add(new ScoreLabel(10));
        this.add(new Quiz_timer(60));
        this.add(new AnswerLabel("",""));
        this.add(new AnswerLabel("",""));
        this.add(new AnswerLabel("",""));
    }
    
}
