package labAssignment4;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

public class Qno2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel mainPanel = new JPanel(new GridLayout(0, 1));
        JPanel panel = new JPanel(new GridLayout(2, 2));

        JLabel numberLabel = new JLabel("Number");
        JLabel reverseLabel = new JLabel("Reverse");
        JTextField numberField = new JTextField();
        JTextField reverseField = new JTextField();
        JButton reverseBtn = new JButton("Reverse");

        ButtonClickReverse listener = new ButtonClickReverse(numberField, reverseField);
        reverseBtn.addActionListener(listener);
        
        panel.add(numberLabel);
        panel.add(numberField);
        panel.add(reverseLabel);
        panel.add(reverseField);
        mainPanel.add(panel);
        mainPanel.add(reverseBtn);
        
        frame.add(mainPanel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ButtonClickReverse implements ActionListener{
    private JTextField number;
    private JTextField reverse;

    public ButtonClickReverse(JTextField number, JTextField reverse) {
        this.number = number;
        this.reverse = reverse;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        long num = Long.parseLong(number.getText());
        long rev = 0;
        while (num > 0) {
            rev = (rev * 10) + (num % 10);
            num = num / 10;
        }
        reverse.setText(String.valueOf(rev));
    }
    
}