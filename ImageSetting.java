package advanceJava;

import javax.swing.*;

public class ImageSetting {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Image Setting");
		JPanel panel = new JPanel();
		ImageIcon image = new ImageIcon("D:/Wallpaper/pa.png");
		JLabel label = new JLabel(image);
		
		panel.add(label);
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setSize(500,500);

	}

}
