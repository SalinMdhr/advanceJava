package LabAssignment2;

import javax.swing.*;
import java.awt.event.*;
import java.io.File;

public class Qno12 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel();
        JButton btn1 = new JButton("Show Message Dialog");
        JButton btn2 = new JButton("Open File Dialog");
        JButton btn3 = new JButton("Confirm Button");
        JButton btn4 = new JButton("Input Button");

        // btn1.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         JOptionPane.showMessageDialog(frame, "This is a message dialog", "Message", JOptionPane.INFORMATION_MESSAGE);
        //     }
        // });

        //shortcut
        btn1.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "This is a message dialog", "Message", JOptionPane.INFORMATION_MESSAGE);
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    JOptionPane.showMessageDialog(frame, "Selected File: " + selectedFile.getAbsolutePath());
                }
            }
        });

        // btn2.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         JFileChooser fileChooser = new JFileChooser();
        //         int result = fileChooser.showSaveDialog(frame);
        //         if (result == JFileChooser.APPROVE_OPTION) {
        //             File selectedFile = fileChooser.getSelectedFile();
        //             JOptionPane.showMessageDialog(frame, "File to save: " + selectedFile.getAbsolutePath());
        //         }
        //     }
        // });
                
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(frame, "Do you want to continue?", "Confirm Box", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(frame, "Selected Yes");
                }
            }
        });

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(frame, "Enter Your Name:");
                if (input != null) {
                    JOptionPane.showMessageDialog(frame, "Hello, " + input);
                }
            }
        });

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        
        frame.add(panel);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }    
}
