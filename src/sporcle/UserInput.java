/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sporcle;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Ryan
 */
public class UserInput extends JTextField implements KeyListener  {
    
    ArrayList<AnswerLabel> answer_list;
    AnswerPanel ans;
    public UserInput(AnswerPanel answer_panel) {
        super("Type Here"); 
        ans = answer_panel;
        this.answer_list = answer_panel.list;
        addKeyListener(this);
  }

    @Override
    public void keyTyped(KeyEvent ke) {    
          for(AnswerLabel answer: answer_list){
              if(answer.answer.equalsIgnoreCase(this.getText()) && !ans.quizStopped){
                  answer.showAnswer();
                  this.setText("");
              }
          }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   }
