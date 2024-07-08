package labAssignment3;

import java.awt.GridLayout;
import javax.swing.*;

public class Qno5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel(new GridLayout(3, 2));
        JLabel num1 = new JLabel("Number 1");
        JLabel num2 = new JLabel("Number 2");
        JTextField field1 = new JTextField(7);
        JTextField field2 = new JTextField(7);
        JButton swapBtn = new JButton("Swap");

        swapBtn.addActionListener(e -> {
            try {
                int number1 = Integer.parseInt(field1.getText());
                int number2 = Integer.parseInt(field2.getText());

                field1.setText(String.valueOf(number2));
                field2.setText(String.valueOf(number1));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
            }

        });

        panel.add(num1);
        panel.add(field1);
        panel.add(num2);
        panel.add(field2);
        panel.add(swapBtn);

        frame.add(panel);
        frame.setSize(300, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
