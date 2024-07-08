package advanceJava;

import javax.swing.*;
import java.awt.*;

public class DrawShapes extends JPanel{

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.drawRect(20, 20, 100, 50);
		g.fillRect(20, 20, 100, 50);
		
		g.setColor(Color.YELLOW);
		g.drawOval(50, 150, 50, 50);
		g.fillOval(50, 150, 50, 50);
		
		g.setColor(Color.GREEN);
		g.drawLine(100, 100, 200, 10);
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Drawing Shapes");
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.add(new DrawShapes());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
