/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sporcle;

import java.awt.Color;
import javax.swing.*;
import java.awt.GridLayout;
import java.util.ArrayList;

/**
 *
 * @author Ryan
 */
class AnswerPanel extends JPanel{
    
    ArrayList<AnswerLabel> list = new ArrayList<>();
    public boolean quizStopped = false;
    public ControlPanel control;
    public AnswerPanel() {
        
    }
    
    public void init(){
        this.setBackground(Color.white);
        this.setLayout(new GridLayout(5, 2));

        AnswerLabel one = new AnswerLabel("1", "Phyrst", control);
        AnswerLabel two = new AnswerLabel("2", "Den", control);
        AnswerLabel three = new AnswerLabel("3", "Gaff", control);
        AnswerLabel four = new AnswerLabel("4", "Champs", control);
        AnswerLabel five = new AnswerLabel("5", "Pickles", control);
        AnswerLabel six = new AnswerLabel("6", "Cafe", control);
        AnswerLabel seven = new AnswerLabel("7", "Mad Mex", control);
        AnswerLabel eight = new AnswerLabel("8", "Chumleys", control);
        AnswerLabel nine = new AnswerLabel("9", "Indigo", control);
        AnswerLabel ten = new AnswerLabel("10", "Bar Bleu", control);

        this.add(one);
        this.add(two);
        this.add(three);
        this.add(four);
        this.add(five);
        this.add(six);
        this.add(seven);
        this.add(eight);
        this.add(nine);
        this.add(ten);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        list.add(six);
        list.add(seven);
        list.add(eight);
        list.add(nine);
        list.add(ten);
    }

    public void showAll() {
        list.stream().forEach((label) -> {
            label.showAnswerNoIncrease();
        });
    }
    
}
