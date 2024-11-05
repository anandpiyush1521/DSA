import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDBUsingMethod {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/org";
            String username = "root";
            String password = "Nisha@123";

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established successfully");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the worker ID: ");
            int workerId = sc.nextInt();

            System.out.println("");

            System.out.print("Enter the update salary: ");
            int salary = sc.nextInt();

            updateSalary(con, workerId, salary);
           

            
            con.close();
        } catch (Exception e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        }
    }

    public static void updateSalary(Connection con, int workerId, int salary){
        try {
            String query = "update worker set salary = ? where worker_id = ?";
            PreparedStatement psmt = con.prepareStatement(query);
            psmt.setInt(1, salary);
            psmt.setInt(2, workerId);

            psmt.executeUpdate();
            System.out.println("Salary updated successfully");

            psmt.close();
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
