package LabAssignment2;

import java.awt.*;
import javax.swing.*;

public class Qno2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel(new GridLayout(2, 2));
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");

        //a
        btn2.setEnabled(false);
        btn4.setEnabled(false);

        //b
        btn1.setText("one");     // btn1.setLabel("One");                               
        btn3.setText("Three");   // btn3.setLabel("Three");                               
        
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        frame.add(panel);
        
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
