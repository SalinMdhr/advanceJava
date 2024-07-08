package labAssignment4;

import javax.swing.*;
import java.awt.*;

public class Qno7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel mainPanel = new JPanel();

        ImageIcon onImage = new ImageIcon("labAssignment4/on.png");
        ImageIcon offImage = new ImageIcon("labAssignment4/off.png");

        JPanel panel1 = new JPanel(new GridBagLayout());
        JPanel panel2 = new JPanel(new GridBagLayout());

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
        panel1.add(new JLabel(offImage), gbc);
        panel2.add(new JLabel(onImage), gbc);

        mainPanel.add(panel1, "1");
        mainPanel.add(panel2, "2");
        
        frame.add(mainPanel);
        frame.setSize(250, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// class ImagePanel extends JPanel{
//     private Image image;

//     public ImagePanel(ImageIcon imageIcon) {
//         this.image = imageIcon.getImage();
//     }

//     @Override
//     public void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         g.drawImage(image, 500, 100, 300, 300, this);
//     }

// }