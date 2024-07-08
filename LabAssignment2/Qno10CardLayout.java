package LabAssignment2;

import java.awt.CardLayout;
import javax.swing.*;

public class Qno10CardLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel mainPanel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");

        CardLayout cl = new CardLayout();
        mainPanel.setLayout(cl);
        
        btn1.addActionListener(e -> {
            cl.show(mainPanel, "2");
        });

        btn2.addActionListener(e -> {
            cl.show(mainPanel, "1");
        });

        panel1.add(btn1);
        panel2.add(btn2);
        
        mainPanel.add(panel1, "1");
        mainPanel.add(panel2, "2");
        
        frame.add(mainPanel);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
