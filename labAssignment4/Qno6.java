package labAssignment4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Qno6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel mainPanel = new JPanel(new GridLayout(0, 1));
        JPanel panel = new JPanel(new GridLayout(2, 2));

        JLabel label = new JLabel("Who is the founder of java?");
        JLabel result = new JLabel();
        JButton btn1 = new JButton("Dennis Ritchie");
        JButton btn2 = new JButton("James Gosling");
        JButton btn3 = new JButton("Guido Van Rossum");
        JButton btn4 = new JButton("Patrick Naughton");

        btn1.addActionListener(new ButtonClickAnswer(btn1, result));
        btn2.addActionListener(new ButtonClickAnswer(btn2, result));
        btn3.addActionListener(new ButtonClickAnswer(btn3, result));
        btn4.addActionListener(new ButtonClickAnswer(btn4, result));

        label.setHorizontalAlignment(SwingConstants.CENTER);
        result.setHorizontalAlignment(SwingConstants.CENTER);

        mainPanel.add(label);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        mainPanel.add(panel);
        mainPanel.add(result);
        
        frame.add(mainPanel);
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ButtonClickAnswer implements ActionListener {
    private JButton btn;
    private JLabel res;

    public ButtonClickAnswer(JButton btn, JLabel res) {
        this.btn = btn;
        this.res = res;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String answer = btn.getText();
        if (answer.equals("James Gosling")) {
            res.setText("You are Correct");
        } else {
            res.setText("You are Incorrect");
        }
    }
}