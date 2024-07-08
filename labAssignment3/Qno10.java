package labAssignment3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Qno10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel(new GridBagLayout());
        JLabel headerLabel = new JLabel("MouseListener");
        JLabel bodyLabel = new JLabel("Welcome to MouseEvent Demo", SwingConstants.CENTER);
        JLabel footerLabel = new JLabel();

        bodyLabel.setPreferredSize(new Dimension(300, 40));
        bodyLabel.setOpaque(true);
        bodyLabel.setBackground(Color.CYAN);
        bodyLabel.setForeground(Color.BLACK);
        bodyLabel.setFont(new Font("Arial", Font.BOLD, 18));

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                footerLabel.setText(String.format("Mouse Clicked(%d, %d)", e.getX(), e.getY()));
            }
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0, 0, 50, 0);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(headerLabel, gbc);

        gbc.gridy = 1;
        panel.add(bodyLabel, gbc);

        gbc.gridy = 2;
        panel.add(footerLabel, gbc);

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
