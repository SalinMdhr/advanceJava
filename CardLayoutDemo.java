package advanceJava;

import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Card Layout Example");
		JPanel cardPanel = new JPanel(new CardLayout());
		
		JPanel card1 = new JPanel();
		card1.add(new JLabel("Card 1"));
		card1.setBackground(Color.BLUE);
		
		JPanel card2 = new JPanel();
		card2.add(new JLabel("Card 2"));
		card2.setBackground(Color.RED);
		
		JPanel card3 = new JPanel();
		card3.add(new JLabel("Card 3"));
		card3.setBackground(Color.GRAY);
		
		cardPanel.add(card3, "Card 3");
		cardPanel.add(card1, "Card 1");
		cardPanel.add(card2, "Card 2");
		
		frame.add(cardPanel);
		frame.setVisible(true);
		frame.pack();

	}

}
