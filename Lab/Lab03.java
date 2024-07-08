package advanceJava.Lab;

import javax.swing.*;
import java.awt.*;

public class Lab03 extends JPanel{

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.drawOval(100, 100, 100, 100);
		g.setColor(Color.YELLOW);
		g.fillOval(100, 100, 100, 100);
		
	}
	
	public static void main(String[] args) {
		//Display red oval with yellow filled in it
		
		JFrame frame = new JFrame("Drawing Oval");
		
		frame.add(new Lab03());
		frame.setVisible(true);
		frame.setSize(250, 250);

	}

}
