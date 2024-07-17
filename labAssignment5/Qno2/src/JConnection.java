import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JConnection {
    private static String url = "jdbc:mysql://localhost:3306/";
    private static final String uname = "root";
    private static final String password = "";

    public JConnection(String db) {
        url += db;
    }

    public Connection getConn() throws SQLException {
        return DriverManager.getConnection(url, uname, password);
    }
}

