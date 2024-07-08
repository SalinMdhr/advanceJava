package LabAssignment2;

import java.awt.GridLayout;
import javax.swing.*;

public class Qno3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel(new GridLayout(0,1));

        JLabel label1 = new JLabel("Choose program to enroll");
        JLabel label2 = new JLabel("Payment");

        JCheckBox cBox1 = new JCheckBox("C");
        JCheckBox cBox2 = new JCheckBox("Java");
        JCheckBox cBox3 = new JCheckBox("HTML");
        JCheckBox cBox4 = new JCheckBox("PHP");
        
        JRadioButton jRadioBtn1 = new JRadioButton("Now");
        JRadioButton jRadioBtn2 = new JRadioButton("Later");
        ButtonGroup btnGroup = new ButtonGroup();

        btnGroup.add(jRadioBtn1);
        btnGroup.add(jRadioBtn2);
        
        panel.add(label1);
        panel.add(cBox1);
        panel.add(cBox2);
        panel.add(cBox3);
        panel.add(cBox4);
        panel.add(label2);
        panel.add(jRadioBtn1);
        panel.add(jRadioBtn2);

        frame.add(panel);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
