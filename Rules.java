package javaapplication1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to QuizMaster");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. Before attempting the quiz, please ensure that you have registered and signed in to your account." + "<br><br>" +
                "2. Questions and answer choices are randomized to prevent cheating and ensure fairness for all participants." + "<br><br>" +
                "3. You are allowed to attempt each quiz only once. Multiple attempts are not permitted to maintain fairness." + "<br><br>" +
                "4. Pay attention to the time limits for each question and the overall quiz. Questions will automatically submit when the time expires." + "<br><br>" +
                "5. The system will automatically score your quiz upon completion, providing instant feedback. The scoring method will be transparent and consistent." + "<br><br>" +
                "6. After completing the quiz, you will have the opportunity to review your results, including correct and incorrect answers" + "<br><br>" +
                "7. Collaboration with others during the quiz is discouraged and may be prohibited." + "<br><br>" +
                "8. Read and understand the instructions for each quiz carefully. " + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
public static void main(String[] args) {
        new Rules("User");
    }
}

