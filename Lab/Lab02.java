package advanceJava.Lab;

import javax.swing.*;
import java.awt.*;

public class Lab02 extends JPanel{

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.GREEN);
		g.drawLine(100, 100, 200, 300);
		
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Drawing green line");
		frame.add(new Lab02());
		frame.setVisible(true);
		frame.setSize(250, 350);

	}

}
