package LabAssignment2;

import java.awt.CardLayout;

import javax.swing.*;

public class Qno10CardLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");

        CardLayout cl = new CardLayout();
        panel1.setLayout(cl);
        
        btn1.addActionListener(e -> {
            cl.show(panel1, "2");
        });

        btn2.addActionListener(e -> {
            cl.show(panel1, "1");
        });

        panel1.add(btn1);
        panel2.add(btn2);

        panel1.add(panel2, "2");
        cl.show(panel1, "1");
        
        frame.add(panel1);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
