package labAssignment4;

import java.awt.Dimension;
import javax.swing.*;

public class Qno13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JPanel panel = new JPanel();
        
        String[][] data = {
            {"1234", "John", "pencil" , "10"},
            {"4567", "Mirian", "pen" , "25"},
            {"4792", "Katy", "chair" , "280"},
            {"5489", "Agnes", "table" , "510"},
            {"6887", "Stanley", "flower" , "30"},
        };

        String[] columnNames = {"ID" , "Name", "product", "price in $"};

        JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(450, 80));
        // table.setFillsViewportHeight(true);

        JScrollPane sp = new JScrollPane(table);

        panel.add(sp);
        
        frame.add(panel);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
