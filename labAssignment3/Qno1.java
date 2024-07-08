package labAssignment3;

import javax.swing.*;
import java.awt.event.*;

public class Qno1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter an Integer");
        JTextField field = new JTextField(8);
        JButton btn = new JButton("Count Down");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(field.getText());
                    if (number <= 0) {
                        field.setText("Invalid Input!");
                    } 
                    StringBuilder countdown = new StringBuilder("Countdown:\n");
                    for (int i = number; i >= 0; i--) {
                        countdown.append(i).append("\n");
                    }
                    JOptionPane.showMessageDialog(frame, countdown.toString(), "Countdown Result", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid integer", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        panel.add(label);
        panel.add(field);
        panel.add(btn);
        
        frame.add(panel);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
