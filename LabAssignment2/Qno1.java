package LabAssignment2;

import javax.swing.*;
import java.awt.*;

public class Qno1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Salin");
		JPanel panel = new JPanel(new GridLayout(3, 2));
		JLabel label1 = new JLabel("Name");
		JLabel label2 = new JLabel("Address");
		JTextField field1 = new JTextField(5);
		JTextField field2 = new JTextField(5);
		JButton btn1 = new JButton("Ok");
		JButton btn2 = new JButton("Cancel");
		
		//a
		label1.setText("Full Name");

		//b
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setHorizontalAlignment(SwingConstants.CENTER);

        // label1.setVerticalAlignment(SwingConstants.CENTER);
        // label2.setVerticalAlignment(SwingConstants.CENTER);

		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(btn1);
		panel.add(btn2);
		frame.add(panel);
		
		frame.setSize(300,150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
