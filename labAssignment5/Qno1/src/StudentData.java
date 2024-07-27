import java.awt.Dimension;
import java.awt.GridLayout;

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
                return column != 0; // Make all columns editable except the first one (Id)
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
    // public static void main(String[] args) {
    // new StudentData();
    // }

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

        JDialog dialog = new JDialog();
        dialog.setTitle("Update student details");
        dialog.setSize(300, 400);
        dialog.setLayout(new GridLayout(9, 2));

        JTextField nameField = new JTextField(name, 20);
        JTextField addressField = new JTextField(address, 20);
        JTextField dobField = new JTextField(dob, 20);
        JTextField phoneField = new JTextField(contact, 20);
        JTextField emailField = new JTextField(email, 20);

        JRadioButton jRadioBtn1 = new JRadioButton("male");
        JRadioButton jRadioBtn2 = new JRadioButton("female");
        ButtonGroup btnGroup = new ButtonGroup();

        btnGroup.add(jRadioBtn1);
        btnGroup.add(jRadioBtn2);

        String[] options = { "Please select one", "BIM", "BCA", "BBM", "CSIT", "BBA", "BHM" };
        JComboBox<String> comboBox = new JComboBox<>(options);

        dialog.add(new JLabel("Name:"));
        dialog.add(nameField);

        dialog.add(new JLabel("Address:"));
        dialog.add(addressField);

        dialog.add(new JLabel("DOB (dd/mm/yyyy):"));
        dialog.add(dobField);

        JPanel btnPanel = new JPanel();
        btnPanel.add(jRadioBtn1);
        btnPanel.add(jRadioBtn2);
        dialog.add(new JLabel("Gender:"));
        dialog.add(btnPanel);

        dialog.add(new JLabel("Program:"));
        dialog.add(comboBox);

        dialog.add(new JLabel("Contact:"));
        dialog.add(phoneField);

        dialog.add(new JLabel("Email:"));
        dialog.add(emailField);

        JButton saveBtn = new JButton("Save");
        saveBtn.addActionListener(ev -> {
            // Get updated values from the fields
            String updatedName = nameField.getText();
            String updatedAddress = addressField.getText();
            String updatedDob = dobField.getText();
            String updatedGender = (jRadioBtn1.isSelected() ? "male" : "female");
            String updatedProgram = (String) comboBox.getSelectedItem();
            String updatedContact = phoneField.getText();
            String updatedEmail = emailField.getText();

            try {
                IRUDFunction update = new IRUDFunction();
                update.updateFunction(id, updatedName, updatedAddress, updatedDob, updatedGender, updatedProgram,
                        updatedContact, updatedEmail);

                // Update the table model with new values
                model.setValueAt(updatedName, selectedRow, 1);
                model.setValueAt(updatedAddress, selectedRow, 2);
                model.setValueAt(updatedGender, selectedRow, 3);
                model.setValueAt(updatedDob, selectedRow, 4);
                model.setValueAt(updatedProgram, selectedRow, 5);
                model.setValueAt(updatedContact, selectedRow, 6);
                model.setValueAt(updatedEmail, selectedRow, 7);

                JOptionPane.showMessageDialog(dialog, "Student details updated successfully!", "Success",
                        JOptionPane.INFORMATION_MESSAGE);

                dialog.dispose();

                System.out.println("UPDATED");
            } catch (Exception ex) {
                System.out.println("ERROR" + ex.getMessage());

            }
        });

        dialog.add(saveBtn);
        dialog.setVisible(true);
    }

    private static void deleteStudentDetails(JTable table) {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            System.out.println("NO ROW SELECTED");
        }

        int id = (int) model.getValueAt(selectedRow, 0);

        int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this", "Delete",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (confirmation == JOptionPane.YES_OPTION) {
            try {
                IRUDFunction delete = new IRUDFunction();
                delete.deleteFunction(id);

                model.removeRow(selectedRow);

                System.out.println("DELETED");
            } catch (Exception ex) {
                System.out.println("ERROR DELETING" + ex.getMessage());

            }
        }

    }

}
