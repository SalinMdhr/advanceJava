package LabAssignment2;

import javax.swing.*;
import java.awt.Dimension;

public class Qno7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Select most visited site: ");
        
        String[] options = {"www.youtube.com", "www.google.com", "www.facebook.com", "www.chatgpt.com", "www.instagram.com"};
        JList<String> list = new JList<>(options);
        JScrollPane sp = new JScrollPane(list);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setPreferredSize(new Dimension(90,100));

        panel.add(label);
        panel.add(sp);
        
        frame.add(panel);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
