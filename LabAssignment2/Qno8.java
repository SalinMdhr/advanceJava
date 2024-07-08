package LabAssignment2;

import javax.swing.*;
import java.awt.*;;

public class Qno8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel(new GridLayout(4, 2));
        JLabel num1 = new JLabel("First Number");
        JLabel num2 = new JLabel("Second Number");
        JLabel result = new JLabel("Result");
        JTextField field1 = new JTextField(5);
        JTextField field2 = new JTextField(5);
        JTextField field3 = new JTextField(5);
        JButton btn1 = new JButton("+");
        JButton btn2 = new JButton("-");    

        panel.add(num1);
        panel.add(field1);
        panel.add(num2);
        panel.add(field2);
        panel.add(result);
        panel.add(field3);
        panel.add(btn1);
        panel.add(btn2);
        frame.add(panel);
        
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
