package advanceJava;

import javax.swing.*;
import java.awt.event.*;

public class EventListnerDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Event listner");
		JPanel panel = new JPanel();
		final JLabel label = new JLabel("Label");
		JButton button = new JButton("Click me");
		
		button.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setText("Mouse Clicked");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				label.setText("Mouse Pressed");
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				label.setText("Mouse Released");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setText("Mouse Entered");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				label.setText("Mouse exited");
			}
			
//			@Override
//			public void mouseDragged(MouseEvent e) {
//				label.setText("Mouse dragged");
//			}
			
//			@Override
//			public void mouseMoved(MouseEvent e) {
//				label.setText("Mouse Moved");
//			}
			
		});
		panel.add(label);
		panel.add(button);
		frame.add(panel);
		
		frame.setVisible(true);

	}

}
