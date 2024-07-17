import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStmtDemo {
    public static void main(String[] args) throws SQLException {
        SIUDMethods runMethods = new SIUDMethods("china_company");

        System.out.println("Operations that can be Performed----");
        System.out.println("1.Insert\t2.Update\t3.Delete\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Choice: ");
        int ch = scan.nextInt();

        String selectQuery = "SELECT * FROM employees";

        switch (ch) {
            case 1:
                runMethods.selectMethod(selectQuery);
                String insertQuery = "INSERT INTO employees (id, name, position, salary) VALUES (?, ?, ?, ?)";
                runMethods.insertMethod(insertQuery);
                runMethods.selectMethod(selectQuery);
                break;

            case 2:
                runMethods.selectMethod(selectQuery);
                String updateQuery = "UPDATE employees SET name = ?, position = ?, salary = ? WHERE id = ?";
                runMethods.updateMethod(updateQuery);
                runMethods.selectMethod(selectQuery);
                break;

            case 3:
                runMethods.selectMethod(selectQuery);
                String deleteQuery = "DELETE FROM employees WHERE id = ?";
                runMethods.deleteMethod(deleteQuery);
                runMethods.selectMethod(selectQuery);

                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }

        scan.close();
    }
}
