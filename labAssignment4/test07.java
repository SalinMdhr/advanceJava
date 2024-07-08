package labAssignment4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class test07 {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Salin");
        JPanel mainPanel = new JPanel();
        
        JPanel panel1 = new JPanel(new GridBagLayout());
        JPanel panel2 = new JPanel(new GridBagLayout());

        BufferedImage onImage = ImageIO.read(new File("labAssignment4/on.png"));
        BufferedImage offImage = ImageIO.read(new File("labAssignment4/off.png"));

        JLabel labelOn = new JLabel(new ImageIcon(onImage));
        JLabel labelOff = new JLabel(new ImageIcon(offImage));
        
        JButton onBtn = new JButton("On");
        JButton offBtn = new JButton("Off");

        CardLayout cl = new CardLayout();
        mainPanel.setLayout(cl);

        onBtn.addActionListener(e -> {
            cl.show(mainPanel, "2");
        });

        offBtn.addActionListener(e -> {
            cl.show(mainPanel, "1");
        });
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0, 0, 20, 0);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel1.add(onBtn, gbc);
        panel2.add(offBtn, gbc);

        gbc.gridy = 1;
        panel1.add(labelOff, gbc);
        panel2.add(labelOn, gbc);

        mainPanel.add(panel1, "1");
        mainPanel.add(panel2, "2");
        
        frame.add(mainPanel);
        frame.setSize(250, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
