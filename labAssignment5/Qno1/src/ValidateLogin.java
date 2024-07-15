import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ValidateLogin {

    public boolean loginValidation(String sqlStmt, String uname, String password) {
        try(Connection conn = JDBCConnection.getConn()) {
            PreparedStatement stmt = conn.prepareStatement(sqlStmt);
            stmt.setString(1, uname);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (Exception e) {
            System.out.println("ERROR");
            return false;
        }
    }
}
