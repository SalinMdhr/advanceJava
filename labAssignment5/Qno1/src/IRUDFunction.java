import java.sql.*;
// import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class IRUDFunction {
    public void insertFunction(
        String name, String address, java.sql.Date dob, String gender, String program, String phone, String email
    ) {
        String query = "INSERT INTO students (fname, address, gender, DOB, program, contact, email) VALUES (?, ?, ?, ?, ?, ?, ?) ";
        try(
            Connection conn = JDBCConnection.getConn();
            PreparedStatement pstmt = conn.prepareStatement(query)
        ) {
            pstmt.setString(1, name);
            pstmt.setString(2, address);
            pstmt.setString(3, gender);
            pstmt.setDate(4, dob);
            pstmt.setString(5, program);
            pstmt.setString(6, phone);
            pstmt.setString(7, email);

            pstmt.executeUpdate();  

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void retrieveFunction(DefaultTableModel model) {
        String query = "SELECT * FROM students";
        try(
            Connection conn = JDBCConnection.getConn();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query)
        ) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("fname");
                String address = rs.getString("address");
                String gender = rs.getString("gender");
                String dob = rs.getString("DOB");
                String program = rs.getString("program");
                String contact = rs.getString("contact");
                String email = rs.getString("email");
                model.addRow(new Object[]{id, name, address, gender, dob, program, contact, email});
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public void updateFunction(
        int id, String name, String address, String dob, String gender, String program, String phone, String email
    ) {
        String query = "UPDATE students SET fname = ?, address = ?, gender = ?, DOB = ?, program = ?, contact = ?, email = ?";
        try(
            Connection conn = JDBCConnection.getConn();
            PreparedStatement pstmt = conn.prepareStatement(query)
        ) {
            pstmt.setString(1, name);
            pstmt.setString(2, address);
            pstmt.setString(3, gender);
            pstmt.setString(4, dob);
            pstmt.setString(5, program);
            pstmt.setString(6, phone);
            pstmt.setString(7, email);
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("IRUD: ERROR" + e.getMessage());
        }
    }

    public void deleteFunction(int id) {
        String query = "DELETE FROM students WHERE id = ?";
        try(
            Connection conn = JDBCConnection.getConn();
            PreparedStatement pstmt = conn.prepareStatement(query)
        ) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("IRUD: DELETE ERROR" + e.getMessage());
        }
    }

}
