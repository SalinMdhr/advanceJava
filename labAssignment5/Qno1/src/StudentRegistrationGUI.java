import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;

public class StudentRegistrationGUI {
    public StudentRegistrationGUI() {
        JFrame frame = new JFrame("Student Registration");
        JPanel mainPanel = new JPanel(new GridLayout(8, 2));
        JPanel btnPanel = new JPanel();

        JLabel nameLabel = new JLabel("Name:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel dobLabel = new JLabel("DOB (dd/mm/yyyy):");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel programLabel = new JLabel("Program:");
        JLabel phoneLabel = new JLabel("Phone:");
        JLabel emailLabel = new JLabel("Email:");

        JTextField nameField = new JTextField(20);
        JTextField addressField = new JTextField(20);
        JTextField dobField = new JTextField(20);
        JTextField phoneField = new JTextField(20);
        JTextField emailField = new JTextField(20);

        JRadioButton jRadioBtn1 = new JRadioButton("male");
        JRadioButton jRadioBtn2 = new JRadioButton("female");
        ButtonGroup btnGroup = new ButtonGroup();

        btnGroup.add(jRadioBtn1);
        btnGroup.add(jRadioBtn2);

        String[] options = { "Please select one", "BIM", "BCA", "BBM", "CSIT", "BBA", "BHM" };
        JComboBox<String> comboBox = new JComboBox<>(options);

        JButton addBtn = new JButton("Add");
        JButton resetBtn = new JButton("Reset");
        JButton cancelBtn = new JButton("Cancel");

        btnPanel.add(addBtn);
        btnPanel.add(resetBtn);
        btnPanel.add(cancelBtn);

        addBtn.addActionListener(e -> {
            if (nameField.getText().isEmpty() || addressField.getText().isEmpty()
                    || phoneField.getText().isEmpty() || emailField.getText().isEmpty()
                    || (!jRadioBtn1.isSelected() && !jRadioBtn2.isSelected())
                    || (comboBox.getSelectedIndex() == 0)
                    || dobField.getText().isEmpty()) {

                String message = "Please input all the fields";
                JOptionPane.showMessageDialog(frame, message, "Error", JOptionPane.INFORMATION_MESSAGE);

            } else {
                String dateStr = dobField.getText();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                dateFormat.setLenient(false);

                try {
                    String name = nameField.getText();
                    String address = addressField.getText();
                    String gender = jRadioBtn1.isSelected() ? "male" : (jRadioBtn2.isSelected() ? "female" : "invalid");
                    String program = (String) comboBox.getSelectedItem();
                    String phone = phoneField.getText();
                    String email = emailField.getText();

                    java.util.Date utilDate = dateFormat.parse(dateStr);
                    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

                    IRUDFunction insert = new IRUDFunction();
                    insert.insertFunction(name, address, sqlDate, gender, program, phone, email);

                    JOptionPane.showMessageDialog(frame, "Student Registered");
                    frame.dispose();
                    new StudentData();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Date is Invalid: " + ex.getMessage());
                }
            }

        });

        resetBtn.addActionListener(e -> {
            nameField.setText(null);
            addressField.setText(null);
            btnGroup.clearSelection();
            comboBox.setSelectedIndex(0);
            phoneField.setText(null);
            emailField.setText(null);
        });

        cancelBtn.addActionListener(e -> {
            // System.exit(0);
            frame.dispose();
            new StudentData();
        });
        
        mainPanel.add(nameLabel);

        
        mainPanel.add(nameField);

        
        mainPanel.add(addressLabel);

        
        mainPanel.add(addressField);

        
        mainPanel.add(dobLabel);

        
        mainPanel.add(dobField);

        
        mainPanel.add(genderLabel);

        JPanel genderPanel = new JPanel();
        genderPanel.add(jRadioBtn1);
        genderPanel.add(jRadioBtn2);

        
        mainPanel.add(genderPanel);

        
        mainPanel.add(programLabel);

        
        comboBox.setPreferredSize(
                new Dimension(nameField.getPreferredSize().width, comboBox.getPreferredSize().height));
        mainPanel.add(comboBox);

        
        mainPanel.add(phoneLabel);

        
        mainPanel.add(phoneField);

        
        mainPanel.add(emailLabel);

        
        mainPanel.add(emailField);

        
        mainPanel.add(btnPanel);

        frame.add(mainPanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // public static void main(String[] args) {
    //     new StudentRegistrationGUI();
    // }
}
