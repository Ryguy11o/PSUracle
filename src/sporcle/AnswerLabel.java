/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sporcle;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Ryan
 */
public class AnswerLabel extends JLabel {

    public String answer;
    
    public AnswerLabel(String  number, String answer) {
        super(number);
        this.answer = answer;
        if(number != ""){
        this.setBorder(BorderFactory.createLineBorder(Color.white, 4));
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setOpaque(true);
        this.setBackground(Color.ORANGE);
        } else{
           
        }
    }
    
   public void showAnswer() {
       this.setText(answer);
       this.setBackground(Color.white);
   }
    
    
}
