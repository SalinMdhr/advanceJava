import java.sql.*;
public class scrollableRS {
    public static void main(String[] args) throws Exception {
        JConnection jConn = new JConnection("nccs");
        try(Connection conn = jConn.getConn()) {

            String query = "SELECT * FROM students";

            // Create a Statement object with scrollable and read-only ResultSet
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            
            // Scroll to the next row
            while (rs.next()) {
                printRow(rs);
            }
            
            // Scroll to the previous row
            while (rs.previous()) {
                printRow(rs);
            }

            // Scroll to a specific row (e.g., the 3rd row)
            if (rs.absolute(3)) {
                printRow(rs);
            } else {
                System.out.println("Row not found");
            }
            
            rs.close();

            // if (rs.last()) {
            //     System.out.println("last");
            //     printRow(rs);
            // }

            // Scroll to the first row
            // if (rs.first()) {
            //     System.out.println("first");
            //     printRow(rs);
            // }

        } catch (Exception e) {
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
