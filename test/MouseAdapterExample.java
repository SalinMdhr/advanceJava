package test;

import javax.swing.*;
import java.awt.event.*;

public class MouseAdapterExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseAdapter Example");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Click anywhere in the panel");

        panel.addMouseListener(new CustomMouseAdapter(label));
        panel.add(label);

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class CustomMouseAdapter extends MouseAdapter {
    private JLabel label;

    public CustomMouseAdapter(JLabel label) {
        this.label = label;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse entered the panel");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse exited the panel");
    }
}
