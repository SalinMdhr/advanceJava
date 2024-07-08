package advanceJava;

import java.awt.Font;
import javax.swing.*;

public class FontSet {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Set Font");
		JLabel label = new JLabel("This is the Font.");
		Font myFont = new Font("SansSerrif", Font.ITALIC + Font.BOLD, 24);
		
		label.setFont(myFont);
		frame.add(label);
		
		frame.setVisible(true);
		frame.setSize(300, 300);

	}

}
