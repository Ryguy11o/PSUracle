/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sporcle;

import java.awt.Color;
import javax.swing.*;
import java.awt.GridLayout;

/**
 *
 * @author Ryan
 */
class AnswerPanel extends JPanel{

    public AnswerPanel() {
        this.setBackground(Color.white);
        this.setLayout(new GridLayout(5,2));
        this.add(new AnswerLabel("1"));
        this.add(new AnswerLabel("2"));
        this.add(new AnswerLabel("3"));
        this.add(new AnswerLabel("4"));
        this.add(new AnswerLabel("5"));
        this.add(new AnswerLabel("6"));
        this.add(new AnswerLabel("7"));
        this.add(new AnswerLabel("8"));
        this.add(new AnswerLabel("9"));
        this.add(new AnswerLabel("10"));
        
        
    }
    
}
