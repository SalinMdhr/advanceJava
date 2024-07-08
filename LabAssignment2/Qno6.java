package LabAssignment2;

import javax.swing.*;

public class Qno6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Select your favourite sport from the list");
        
        String[] sports = {"Badminton", "Hockey", "Tennis", "Football", "Cricket", "Formula One", "Rugby"};
        JList<String> list = new JList<>(sports);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        panel.add(label);
        panel.add(list);
        frame.add(panel);
        
        frame.setSize(500, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }    
}
