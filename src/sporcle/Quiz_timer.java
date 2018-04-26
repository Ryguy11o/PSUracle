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
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author Ryan
 */
public class Quiz_timer extends JLabel {
    
    private int minutes;
    private int seconds;
    private int time;
    private Timer t;
    private AnswerPanel answer_panel;
    
    public Quiz_timer(int time, AnswerPanel answer_panel) {
        super();
        this.time = time;
        this.answer_panel = answer_panel;
        this.setMinutesAndSeconds();
        this.setBorder(BorderFactory.createLineBorder(Color.black, 4));
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
        this.setTime();
        t = new Timer();
        t.schedule(new TimerTask() {
        @Override
            public void run() {
                Quiz_timer.this.time--; 
                Quiz_timer.this.setMinutesAndSeconds();
                Quiz_timer.this.setTime();
            }
        }, 0, 1000);
        
    }
    
    public void setMinutesAndSeconds(){
        minutes = (int)(Math.floor(time/60));
        seconds = (int) time % 60;
    }
    
    public void setTime(){
        if(time == 0){
            t.cancel();
            this.answer_panel.showAll();
            this.answer_panel.quizStopped = true;
        } 
        
        
        String second_text;
        if(seconds == 0){
            second_text = "00";
        }
        else {
            second_text = Integer.toString(seconds);
        }
        String time_text = minutes + ":" + second_text;
        this.setText(time_text);
    }
     
}
