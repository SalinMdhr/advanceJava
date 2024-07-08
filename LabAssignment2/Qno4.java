package LabAssignment2;

import java.awt.*;
import javax.swing.*;

public class Qno4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel(new GridBagLayout());
        
        JLabel label = new JLabel("Which language you like the most? ");
        String[] options = {"C", "Java", "Python", "C++", "Dot Net"};
        JComboBox<String> comboBox = new JComboBox<>(options);

        //a
        String str = "Total item is " + comboBox.getItemCount();
        JLabel count = new JLabel(str);

        //b
        String selectedItem = "Selected Item: " + comboBox.getSelectedItem();
        JLabel item = new JLabel(selectedItem);

        // Add an action listener to update the selected item label
        comboBox.addActionListener(e -> {
            String selected = "Selected Item: " + comboBox.getSelectedItem();
            item.setText(selected);
        });

        //c
        comboBox.setSelectedIndex(comboBox.getItemCount() - 1);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(label, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(comboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(count, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(item, gbc);

        frame.add(panel);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}