package labAssignment3;

import javax.swing.*;

public class Qno7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Number");
        JLabel label2 = new JLabel("Factorial");
        JButton calculateBtn = new JButton("Calculate");
        JTextField input = new JTextField(7);
        JTextField output = new JTextField(7);

        calculateBtn.addActionListener(e -> {
            int factotial = 1;
            int num = Integer.parseInt(input.getText());

            if (num == 0 || num == 1) {
                output.setText(String.valueOf(num));
            } else {
                for (int i = num; i > 0; i--) {
                    factotial *= i;
                }
                output.setText(String.valueOf(factotial));
            }

        });
        
        panel.add(label1);
        panel.add(input);
        panel.add(calculateBtn);
        panel.add(label2);
        panel.add(output);
        
        frame.add(panel);
        frame.setSize(500, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
