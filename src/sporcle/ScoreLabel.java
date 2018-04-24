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
public class ScoreLabel  extends JLabel {
        
        int score = 0; 
    
    public ScoreLabel(int x) {
        super("Score: 0/" + x); 
        
        this.setBorder(BorderFactory.createLineBorder(Color.black, 4));
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
    }

    public void increaseScore() {
        score++;
        this.setText("Score: " + score + "/");
    }
}
