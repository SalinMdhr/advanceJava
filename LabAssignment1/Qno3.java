package LabAssignment1;

import java.awt.FlowLayout;
import javax.swing.*;

public class Qno3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btn = new JButton("Hello");
        
        panel.add(btn);
        
        frame.add(panel);
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }    
}
