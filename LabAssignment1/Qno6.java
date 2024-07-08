package LabAssignment1;

import javax.swing.*;

public class Qno6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("User ID");
        JTextField field = new JTextField(5);
        
        panel.add(label);
        panel.add(field);
        frame.add(panel);
        
        frame.setSize(180, 80);;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }    
}
