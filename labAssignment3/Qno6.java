package labAssignment3;

import java.awt.*;
import javax.swing.*;

public class Qno6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel(new GridBagLayout());
        JLabel label1 = new JLabel("Number 1");
        JLabel label2 = new JLabel("Number 2");
        JLabel label3 = new JLabel("Result");
        JTextField num1 = new JTextField(7);
        JTextField num2 = new JTextField(7);
        JTextField result = new JTextField(7);
        JButton addBtn = new JButton("+");
        JButton subtractBtn = new JButton("-");
        JButton multiplyBtn = new JButton("*");
        JButton divideBtn = new JButton("/");

        addBtn.addActionListener(e -> {
            int x = Integer.parseInt(num1.getText());
            int y = Integer.parseInt(num2.getText());

            result.setText(String.valueOf(x + y));
        });

        subtractBtn.addActionListener(e -> {
            int x = Integer.parseInt(num1.getText());
            int y = Integer.parseInt(num2.getText());

            result.setText(String.valueOf(x - y));
        });

        multiplyBtn.addActionListener(e -> {
            int x = Integer.parseInt(num1.getText());
            int y = Integer.parseInt(num2.getText());

            result.setText(String.valueOf(x * y));
        });

        divideBtn.addActionListener(e -> {
            int x = Integer.parseInt(num1.getText());
            int y = Integer.parseInt(num2.getText());

            result.setText(String.valueOf(x / y));
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(label1, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(num1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(label2, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(num2, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(label3, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(result, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(addBtn, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(subtractBtn, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 3;
        panel.add(multiplyBtn, gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        panel.add(divideBtn, gbc);
        
        frame.add(panel);
        frame.setSize(500,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
