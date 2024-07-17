import javax.swing.*;
import java.awt.*;

public class UserLoginGUI {
    private JTextField unameField, passField;

    public UserLoginGUI() {
        JFrame frame = new JFrame("User Login");
        JPanel panel = new JPanel(new GridBagLayout());
        
        JLabel unameLabel = new JLabel("Username");
        JLabel passLabel = new JLabel("Password");
        JLabel msgLabel = new JLabel();
        unameField = new JTextField(15);
        passField = new JTextField(15);
        JButton submitBtn = new JButton("Submit");

        submitBtn.addActionListener(e -> {
            String username = unameField.getText();
            String password = passField.getText();
            String query = "SELECT * FROM users WHERE username = ? AND upassword = ?";
            ValidateLogin vl = new ValidateLogin();
            boolean isValid = vl.loginValidation(query, username, password);

            if(isValid) {
                JOptionPane.showMessageDialog(frame, "Welcome User", "Welcome", JOptionPane.INFORMATION_MESSAGE);
                msgLabel.setText(null);
                new StudentData();

            } else {
                msgLabel.setText("Incorrect username or password");
            }

        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0, 5, 15, 0);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(unameLabel, gbc);

        gbc.gridx = 1;
        panel.add(unameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(passLabel, gbc);

        gbc.gridx = 1;
        panel.add(passField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(submitBtn, gbc);

        msgLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(msgLabel, gbc);
       
        frame.add(panel);
        frame.setSize(600, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new UserLoginGUI();
    }
}
