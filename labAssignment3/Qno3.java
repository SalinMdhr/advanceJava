package labAssignment3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Qno3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel();
        JButton btnRed = new JButton("RED");
        JButton btnGreen = new JButton("GREEN");
        JButton btnBlue = new JButton("BLUE");
        JButton btnClose = new JButton("CLOSE");

        btnRed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
            }
        });

        btnGreen.addActionListener(e -> {
            panel.setBackground(Color.GREEN);
        });

        btnBlue.addActionListener(e -> {
            panel.setBackground(Color.BLUE);
        });

        btnClose.addActionListener(e -> {
            System.exit(0);
        });

        panel.add(btnRed);
        panel.add(btnGreen);
        panel.add(btnBlue);
        panel.add(btnClose);

        frame.add(panel);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
