package labAssignment3;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Qno9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter Text");
        JLabel result = new JLabel();
        JTextField field = new JTextField(7);

        field.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                result.setText(field.getText());
            }
        });

        panel.add(label);
        panel.add(field);
        panel.add(result);
        
        frame.add(panel);
        frame.setSize(500, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
