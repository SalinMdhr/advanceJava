package labAssignment4;

import javax.swing.*;
import java.awt.*;

public class Qno5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel(new GridBagLayout());

        JLabel label = new JLabel("Find the Largest One");
        JLabel result = new JLabel();
        JLabel num1Label = new JLabel("Frirst Number");
        JLabel num2Label = new JLabel("Second Number");
        JTextField num1Field = new JTextField(7);
        JTextField num2Field = new JTextField(7);
        JButton checkBtn = new JButton("Check");

        checkBtn.addActionListener(e -> {
            try {
                int x = Integer.parseInt(num1Field.getText());
                int y = Integer.parseInt(num2Field.getText());
                int z = Math.max(x, y);

                result.setText(String.format("%d is largest", z));
            } catch (Exception ex) {
                result.setText("Invalid Input");
            }

        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0, 0, 30, 0);
        // gbc.fill = GridBagConstraints.HORIZONTAL;

        label.setHorizontalAlignment(SwingConstants.CENTER);
        result.setHorizontalAlignment(SwingConstants.CENTER);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(label, gbc);

        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(num1Label, gbc);

        gbc.gridx = 1;
        panel.add(num1Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(num2Label, gbc);

        gbc.gridx = 1;
        panel.add(num2Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(checkBtn, gbc);

        gbc.insets = new Insets(30, 0, 0, 0);
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(result, gbc);

        frame.add(panel);
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
