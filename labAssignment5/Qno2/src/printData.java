import java.sql.*;

public class printData {
    public static void main(String[] args){
        JConnection jConn = new JConnection("pasal");
        try(
            Connection conn = jConn.getConn();
            Statement stmt = conn.createStatement();
        ) {
            String sql = "SELECT * FROM products";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("ID\tName\tPrice\tQuatity");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");

                System.out.println(id + "\t" + name + "\t" + price + "\t" + quantity);
            }
        } catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());
        } 
    }
}
