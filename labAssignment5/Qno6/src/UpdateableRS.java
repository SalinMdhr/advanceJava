import java.sql.*;
import java.util.Scanner;

public class UpdateableRS {
    public static void main(String[] args) throws SQLException {
        JConnection jConn = new JConnection("nccs");
        try(Connection conn = jConn.getConn()) {

            String query = "SELECT * FROM students";

            // Create a Statement object with scrollable and read-only ResultSet
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(query);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the row you want to update: ");
            int updateRow = sc.nextInt();
            sc.nextLine();
            
            if (rs.absolute(updateRow)) { // Move to the first row
                System.out.println("Original data:");
                printRow(rs);

                System.out.print("Enter name: ");
                String updatedName = sc.nextLine();

                System.out.print("Enter address: ");
                String updatedAddress = sc.nextLine();

                System.out.print("Enter gender: ");
                String updatedGender = sc.nextLine();

                System.out.print("Enter dob: ");
                String updatedDob = sc.nextLine();

                System.out.print("Enter program: ");
                String updatedProgram = sc.nextLine();

                System.out.print("Enter contact: ");
                String updatedContact = sc.nextLine();

                System.out.print("Enter email: ");
                String updatedEmail = sc.nextLine();

                // Update the 'fname' column of the first row
                rs.updateString("fname", updatedName);
                rs.updateString("address", updatedAddress);
                rs.updateString("gender", updatedGender);
                rs.updateString("DOB", updatedDob);
                rs.updateString("program", updatedProgram);
                rs.updateString("contact", updatedContact);
                rs.updateString("email", updatedEmail);
                rs.updateRow(); // Commit the change to the database

                System.out.println("Data after update:");
                printRow(rs);

                sc.close();
            } else {
                System.out.println("Row not found");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printRow(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String name = rs.getString("fname");
        String address = rs.getString("address");
        String gender = rs.getString("gender");
        String dob = rs.getString("DOB");
        String program = rs.getString("program");
        String contact = rs.getString("contact");
        String email = rs.getString("email");

        System.out.printf("ID: %d, Name: %s, Address: %s, Gender: %s, DOB: %s, Program: %s, Contact: %s, Email: %s\n\n",
                id, name, address, gender, dob, program, contact, email);
    }
}
