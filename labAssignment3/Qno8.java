package labAssignment3;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Qno8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel(new GridLayout(3, 2));
        JLabel curr1 = new JLabel("Dollar");
        JLabel curr2 = new JLabel("Nepalese");
        JLabel curr3 = new JLabel("Euro");
        JTextField dollar = new JTextField(10);
        JTextField nepalese = new JTextField(10);
        JTextField euro = new JTextField(10);

        curr1.setHorizontalAlignment(SwingConstants.RIGHT);
        curr2.setHorizontalAlignment(SwingConstants.RIGHT);
        curr3.setHorizontalAlignment(SwingConstants.RIGHT);

        double dollarToNepalease = 112;
        double dollarToEuro = 0.89;

        dollar.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                try {
                    double dollarValue = Double.parseDouble(dollar.getText());
                    nepalese.setText(String.format("%.2f", dollarValue * dollarToNepalease));
                    euro.setText(String.format("%.2f", dollarValue * dollarToEuro));

                } catch (NumberFormatException ex) {
                    nepalese.setText("");
                    euro.setText("");
                }
            }
        });

        nepalese.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                try {
                    double nepaleseValue = Double.parseDouble(nepalese.getText());
                    dollar.setText(String.format("%.2f", nepaleseValue / dollarToNepalease));
                    euro.setText(String.format("%.2f", (nepaleseValue / dollarToNepalease) * dollarToEuro));
                } catch (NumberFormatException ex) {
                    dollar.setText("");
                    euro.setText("");
                }
            }
        });

        euro.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                try {
                    double euroValue = Double.parseDouble(euro.getText());
                    dollar.setText(String.format("%.2f", euroValue / dollarToEuro));
                    nepalese.setText(String.format("%.2f", (euroValue / dollarToEuro) * dollarToNepalease));
                } catch (NumberFormatException ex) {
                    dollar.setText("");
                    euro.setText("");
                }
            }
        });
        
        panel.add(curr1);
        panel.add(dollar);
        panel.add(curr2);
        panel.add(nepalese);
        panel.add(curr3);
        panel.add(euro);
        
        frame.add(panel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
