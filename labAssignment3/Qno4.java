package labAssignment3;

import javax.swing.*;

public class Qno4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JButton submitBtn = new JButton("Submit");
        JTextField field = new JTextField(20);

        submitBtn.addActionListener(e -> {
            label.setText(field.getText());
        });
        
        panel.add(field);
        panel.add(submitBtn);
        panel.add(label);
        
        frame.add(panel);
        frame.setSize(500, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
