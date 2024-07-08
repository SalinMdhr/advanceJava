package labAssignment4;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

public class Qno1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel mainPanel = new JPanel(new GridLayout(0, 1));
        JPanel panel = new JPanel(new GridLayout(2, 2));
        JLabel numberLabel = new JLabel("Number");
        JLabel primeLabel = new JLabel("Prime");
        JTextField numberField = new JTextField();
        JTextField primeField = new JTextField();
        JButton checkBtn = new JButton("Check");

        ButtonClickListener listener = new ButtonClickListener(numberField, primeField);
        checkBtn.addActionListener(listener);
        
        panel.add(numberLabel);
        panel.add(numberField);
        panel.add(primeLabel);
        panel.add(primeField);
        mainPanel.add(panel);
        mainPanel.add(checkBtn);
        
        frame.add(mainPanel);
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ButtonClickListener implements ActionListener {
    
    private JTextField number;
    private JTextField prime;

    public ButtonClickListener(JTextField number, JTextField prime) {
        this.number = number;
        this.prime = prime;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(number.getText());
        boolean flag = true;

        for (int i = 2; i <= num/i; i++) {
            if (num % i == 0) {
                prime.setText("Not Prime");
                flag = false;
                break;
            }
        }
        if (flag == true) {
            prime.setText("Yes");
        }
        
    }

}