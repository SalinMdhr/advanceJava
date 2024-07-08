package labAssignment4;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Qno3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel numberLabel = new JLabel("Number");
        JLabel resultLabel = new JLabel();
        JTextField numberField = new JTextField(7);
        JButton checkBtn = new JButton("Check");

        ButtonClickArmstrong listener = new ButtonClickArmstrong(numberField, resultLabel);
        checkBtn.addActionListener(listener);
        
        panel.add(numberLabel);
        panel.add(numberField);
        panel.add(checkBtn);
        panel.add(resultLabel);
        
        frame.add(panel);
        frame.setSize(500, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ButtonClickArmstrong implements ActionListener {
    private JTextField number;
    private JLabel result;

    public ButtonClickArmstrong(JTextField number, JLabel result) {
        this.number = number;
        this.result = result;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(number.getText());
        int store = 0, temp;
        String str = (String.valueOf(num));
        int d = str.length();
        // if (num < 999) {
        //     while (num > 0) {
        //         temp = num % 10;
        //         store = store + (temp * temp * temp);
        //         num = num / 10;
        //     }
        // } else {
        //     while (num > 0) {
        //         temp = num % 10;
        //         store = store + (temp * temp * temp * temp);
        //         num = num / 10;
        //     }
        // }
        while (num > 0) {
            temp = num % 10;
            store = store + (int) Math.pow(temp, d);
            num = num / 10;
        }

        if (store == Integer.parseInt(number.getText())) {
            result.setText("It is Armstrong.");
        } else {
            result.setText("It is not Armstrong.");
        }
    }
    
}