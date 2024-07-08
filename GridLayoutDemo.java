package advanceJava;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Grid Layout Example");
		JPanel panel = new JPanel(new GridLayout(2,3)); //row, column
		
		panel.add(new JButton("Button 1"));
		panel.add(new JButton("Button 2"));
		panel.add(new JButton("Button 3"));
		panel.add(new JButton("Button 4"));
		panel.add(new JButton("Button 5"));
		panel.add(new JButton("Button 6"));
		panel.add(new JButton("Button 7"));
		panel.add(new JButton("Button 8"));
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

	}

}
