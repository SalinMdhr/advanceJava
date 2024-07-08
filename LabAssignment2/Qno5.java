package LabAssignment2;

import java.awt.Dimension;
import javax.swing.*;

public class Qno5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Choose the planet");

        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Pluto"};
        JList<String> list = new JList<>(planets);
        JScrollPane sp = new JScrollPane(list);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setPreferredSize(new Dimension(100, 60));
        
        panel.add(label);
        panel.add(sp);
        frame.add(panel);
        
        frame.setSize(400, 150);
        // frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
