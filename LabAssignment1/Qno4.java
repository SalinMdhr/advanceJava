package LabAssignment1;

import javax.swing.*;
import java.awt.*;

public class Qno4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btn1 = new JButton("Apple");
        JButton btn2 = new JButton("Orange");
        JButton btn3 = new JButton("Guava");
        
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        frame.add(panel);
        
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
