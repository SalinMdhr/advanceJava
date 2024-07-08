package advanceJava;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Flow Layout");
		JPanel panel = new JPanel();
		JButton jb1 = new JButton("Button 1");
		JButton jb2 = new JButton("Button 2");
		JButton jb3 = new JButton("Button 3");
		
		panel.setLayout(new FlowLayout());
		panel.add(jb1); panel.add(jb2); panel.add(jb3);
		frame.add(panel);
		
		frame.pack(); // same as frame.setSize();
		frame.setVisible(true);
		
	}

}
