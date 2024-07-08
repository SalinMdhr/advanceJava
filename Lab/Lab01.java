package advanceJava.Lab;

import javax.swing.*;

public class Lab01 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Lab 01");
//		JPanel panel = new JPanel();
		JLabel label = new JLabel("Salin Manandhar");
		
//		panel.add(label);
		frame.add(label);
		
		frame.setVisible(true);
		frame.setSize(200,100);

	}

}
