package advanceJava;

import java.awt.*;
import java.awt.event.*;

public class KeyAdapterDemo extends KeyAdapter{
	private Frame f;
	private Label headerLabel;
	private Label statusLabel;
	private Panel panel;
	private TextField textField;
	
	public KeyAdapterDemo() {
		f = new Frame("Key adapter example");
		f.setSize(400,300);
		f.setVisible(true);
		f.setLayout(new GridLayout(3,1));
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		headerLabel = new Label("Header Label", Label.CENTER);
		statusLabel = new Label("", Label.CENTER);
		panel = new Panel();
		panel.setLayout(new FlowLayout());
		
		panel.add(headerLabel);
		panel.add(statusLabel);
		f.add(panel);
		
		textField = new TextField(10);
		textField.addKeyListener(this);
		panel.add(textField);
		
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
	}
	
//	@Override
	public void KeyPressed(KeyEvent e) {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		new KeyAdapterDemo();

	}

}
