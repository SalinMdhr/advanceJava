package LabAssignment2;

import javax.swing.*;
import java.awt.*;

public class Qno9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel(new GridBagLayout());

        JLabel label = new JLabel("control in action: TextArea");
        JLabel comment = new JLabel("Comments:");
        JTextArea textArea = new JTextArea("We are demonstrating TextArea");
        JButton btn = new JButton("Show");

        JScrollPane sp = new JScrollPane(textArea);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp.setPreferredSize(new Dimension(200,100));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(label, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(comment, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(sp, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(btn, gbc);

        frame.add(panel);
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }    
}
