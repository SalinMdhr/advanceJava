import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    private static final String url = "jdbc:mysql://localhost:3306/nccs";
    private static final String uname = "root";
    private static final String password = "";

    public static Connection getConn() throws SQLException {
        return DriverManager.getConnection(url, uname, password);
    }

}
