import javax.swing.*;
import java.awt.*;

public class UserLogin {
    private JTextField unameField, passField;

    public UserLogin() {
        JFrame frame = new JFrame("User Login");
        JPanel panel = new JPanel(new GridBagLayout());
        
        JLabel unameLabel = new JLabel("Username");
        JLabel passLabel = new JLabel("Password");
        unameField = new JTextField(7);
        passField = new JTextField(7);
        JButton submitBtn = new JButton("Submit");

        submitBtn.addActionListener(e -> {
            String username = unameField.getText();
            String password = passField.getText();
            String query = "SELECT * FROM users WHERE username = ? AND passwords = ?";
            ValidateLogin vl = new ValidateLogin();
            boolean isValid = vl.loginValidation(query, username, password);

            if(isValid) {
                // unameLabel.setText("VALID");
            }

        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0, 0, 15, 0);
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
       
        frame.add(panel);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        // JDBCConnection jconn = new JDBCConnection();
        new UserLogin();

    }
}