package LabAssignment2;

import java.awt.BorderLayout;
import javax.swing.*;

public class Qno10BorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label1 = new JLabel("Label 1");
        JLabel label2 = new JLabel("Label 2");
        JLabel label3 = new JLabel("Label 3");

        panel.add(label1, BorderLayout.NORTH);
        panel.add(label2, BorderLayout.SOUTH);
        panel.add(label3, BorderLayout.EAST);

        frame.add(panel);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
