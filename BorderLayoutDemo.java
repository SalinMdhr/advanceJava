package advanceJava;

import java.awt.*;

public class BorderLayoutDemo {
	
	public BorderLayoutDemo() {
		Frame f = new Frame("Border Layout Example");
		f.setLayout(new BorderLayout());
		
		Button b1 = new Button("Button 1");
		Button b2 = new Button("Button 2");
		Button b3 = new Button("Button 3");
		Button b4 = new Button("Button 4");
		
		f.add(b1, BorderLayout.CENTER);
		f.add(b2, BorderLayout.NORTH);
		f.add(b3, BorderLayout.EAST);
		f.add(b4, BorderLayout.SOUTH);
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutDemo();
		
	}

}
