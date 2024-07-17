import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SIUDMethods {
    private Connection conn;
    Scanner sc = new Scanner(System.in);
    private String name, position;
    private int id;
    private double salary;
    
    public SIUDMethods(String db_name) throws SQLException {
        JConnection jConn = new JConnection(db_name);
        conn = jConn.getConn();
    }

    public void selectMethod(String sql) {
        System.out.println("\nId\tName\t\tPosition\tSalary");
        try(Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                position = rs.getString("position");
                salary = rs.getDouble("salary");

                System.out.println(id + "\t" + name + "\t" + position + "\t\t" + salary);
            }
        } catch (Exception e) {
            System.out.println("ERROR" + e.getMessage());
        }
    }

    public void insertMethod(String sql) {

        System.out.println("\nEnter the details of the employees:-");
        System.out.print("Enter Id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter position: ");
        position = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();

        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, position);
            pstmt.setDouble(4, salary);
            pstmt.executeUpdate();
            System.out.println("Insert Successful");
        } catch (SQLException e) {
            System.out.println("Insert ERROR" + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public void updateMethod(String sql) {
        System.out.print("\nEnter the id of the employee that is to be updated: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("New name: ");
        name = sc.nextLine();

        System.out.print("New position: ");
        position = sc.nextLine();

        System.out.print("New Salary: ");
        salary = sc.nextDouble();

        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, position);
            pstmt.setDouble(3, salary);
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
            System.out.println("Update Successful");
        } catch (Exception e) {
            System.out.println("Update ERROR" + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public void deleteMethod(String sql) {
        System.out.print("\nEnter the id of the employee that is to be deleted: ");
        id = sc.nextInt();

        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Delete Successful");
        } catch (Exception e) {
            System.out.println("Delete ERROR" + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
