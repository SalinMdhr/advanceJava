package test;

import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "password";
        int employeeId = 101;
        String sql = "SELECT * FROM employees WHERE id = ?";

        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement pstmt = conn.prepareStatement(sql);
            ) {
            pstmt.setInt(1, employeeId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                System.out.println("ID: " + id + " Name: " + name + " Salary: " + salary);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
