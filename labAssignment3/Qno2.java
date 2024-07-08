package labAssignment3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Qno2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Count");
        JTextField field = new JTextField(7);
        JButton btn1 = new JButton("Up");
        JButton btn2 = new JButton("Down");
        JButton btn3 = new JButton("Reset");

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(field.getText());
                    num++;
                    field.setText(String.valueOf(num));

                } catch (Exception ex) {
                    field.setText("Invalid Input");
                }
            }
        });

        btn2.addActionListener(e -> {
            try {
                int num = Integer.parseInt(field.getText());
                num--;
                field.setText(String.valueOf(num));
            } catch (Exception ex) {
                field.setText("Invalid Input");
            }
        });

        btn3.addActionListener(e -> {
            field.setText("0");
        });
        
        panel.add(label);
        panel.add(field);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        
        frame.add(panel);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
