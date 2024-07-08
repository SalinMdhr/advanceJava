package test;

import java.sql.*;

public class ResultSetExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "password";
        
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            
            // Forward Only ResultSet
            Statement forwardOnlyStmt = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            ResultSet forwardOnlyRs = forwardOnlyStmt.executeQuery("SELECT * FROM employees");
            while (forwardOnlyRs.next()) {
                System.out.println(forwardOnlyRs.getInt("id") + ", " + forwardOnlyRs.getString("name"));
            }

            // Scroll Insensitive ResultSet
            Statement scrollInsensitiveStmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet scrollInsensitiveRs = scrollInsensitiveStmt.executeQuery("SELECT * FROM employees");
            if (scrollInsensitiveRs.last()) {
                System.out.println("Last Row: " + scrollInsensitiveRs.getInt("id") + ", " + scrollInsensitiveRs.getString("name"));
            }

            // Scroll Sensitive ResultSet
            Statement scrollSensitiveStmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet scrollSensitiveRs = scrollSensitiveStmt.executeQuery("SELECT * FROM employees");
            scrollSensitiveRs.absolute(2); // Move to the second row
            System.out.println("Second Row: " + scrollSensitiveRs.getInt("id") + ", " + scrollSensitiveRs.getString("name"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
