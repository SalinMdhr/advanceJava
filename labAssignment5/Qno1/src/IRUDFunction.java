import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
