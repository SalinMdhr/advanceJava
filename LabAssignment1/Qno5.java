package LabAssignment1;

// import java.awt.GridBagConstraints;
// import java.awt.GridBagLayout;
// import java.awt.Insets;
import java.awt.*;
import javax.swing.*;

public class Qno5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel(new GridBagLayout());

        JButton btn1 = new JButton("One");
        JButton btn2 = new JButton("Two");
        JButton btn3 = new JButton("Three");
        JButton btn4 = new JButton("Four");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(btn1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(btn2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(btn3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(btn4, gbc);

        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }    
}
