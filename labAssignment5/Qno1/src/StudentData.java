import java.awt.Dimension;
// import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class StudentData {
    private static DefaultTableModel model;
    public StudentData() {
        JFrame frame = new JFrame("Student List");
        JPanel panel = new JPanel();

        JButton updateBtn = new JButton("Update");
        JButton deleteBtn = new JButton("Delete");

        JTable table = new JTable();
        table.setPreferredScrollableViewportSize(new Dimension(800, 100));
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column !=0; // Make all columns editable except the first one (Id)
            }
        };
        table.setModel(model);
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Address");
        model.addColumn("Gender");
        model.addColumn("Date of Birth");
        model.addColumn("Program");
        model.addColumn("Contact");
        model.addColumn("Email");

        TableColumn emailColumn = table.getColumnModel().getColumn(7); // Index 3 for the "Email" column
        emailColumn.setPreferredWidth(200); // Set preferred width as 200 pixels

        IRUDFunction retrive = new IRUDFunction();
        retrive.retrieveFunction(model);

        JScrollPane sp = new JScrollPane(table);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        updateBtn.addActionListener(e -> updateStudentDetails(table));
        deleteBtn.addActionListener(e -> deleteStudentDetails(table));

        panel.add(sp);
        panel.add(updateBtn);
        panel.add(deleteBtn);
        
        frame.add(panel);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new StudentData();
    }

    private static void updateStudentDetails(JTable table) {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            System.out.println("NO ROW SELECTED");
        }

        int id = (int) model.getValueAt(selectedRow, 0);
        String name = (String) model.getValueAt(selectedRow, 1);
        String address = (String) model.getValueAt(selectedRow, 2);
        String gender = (String) model.getValueAt(selectedRow, 3);
        String dob = (String) model.getValueAt(selectedRow, 4);
        String program = (String) model.getValueAt(selectedRow, 5);
        String contact = (String) model.getValueAt(selectedRow, 6);
        String email = (String) model.getValueAt(selectedRow, 7);

        try {
            IRUDFunction update = new IRUDFunction();
            update.updateFunction(id, name, address, dob, gender, program, contact, email);

            System.out.println("UPDATED");
        } catch (Exception ex) {
            System.out.println("ERROR" + ex.getMessage());

        }
    }

    private static void deleteStudentDetails(JTable table) {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            System.out.println("NO ROW SELECTED");
        }

        int id = (int) model.getValueAt(selectedRow, 0);

        try {
            IRUDFunction delete = new IRUDFunction();
            delete.deleteFunction(id);

            System.out.println("DELETED");
        } catch (Exception ex) {
            System.out.println("ERROR DELETING" + ex.getMessage());

        }
    }

}
