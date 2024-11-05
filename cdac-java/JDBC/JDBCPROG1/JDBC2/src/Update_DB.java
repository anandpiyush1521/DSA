import java.io.*;
import java.sql.*;
import java.util.*;

public class Update_DB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/org";
            String username = "root";
            String password = "Nisha@123";

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established successfully");

            String query = "update worker set salary = ? where worker_id = ?";

            PreparedStatement psmt = con.prepareStatement(query);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the worker id: ");
            int workerId = sc.nextInt();

            System.out.println("Enter the salary: ");
            int salary = sc.nextInt();

            psmt.setInt(1, salary);
            psmt.setInt(2, workerId);

            psmt.executeUpdate(); // for insert update and delete

            System.out.println("result updated successfully");

            psmt.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to database.");
            e.printStackTrace();
        }
    }

    // public static void updateSalary(Connection con, int workerId, int salary){
    //     try {
    //         String query = "update worker set salary = ? where worker_id = ?";
    //         PreparedStatement psmt = con.prepareStatement(query);
    //         psmt.setInt(1, salary);
    //         psmt.setInt(2, workerId);

    //         psmt.executeUpdate();
    //         System.out.println("Salary updated successfully");
    //     } catch (SQLException e) {
    //         // TODO: handle exception
    //         e.printStackTrace();
    //     }
    // }

    // public static void selectNamesBySalary(Connection con, double salary) {
    //     try {
    //         String query = "select first_name from worker where salary = ?";
    //         PreparedStatement psmt = con.prepareStatement(query);
    //         psmt.setDouble(1, salary);

    //         ResultSet rs = psmt.executeQuery();
    //         while (rs.next()) {
    //             System.out.println(rs.getString("first_name"));
    //         }

    //         rs.close();
    //     } catch (SQLException e) {
    //         e.printStackTrace();
    //     }
    // }

    // public static void selectNamesByDepartment(Connection con, String department) {
    //     try {
    //         String query = "select first_name from worker where department = ?";
    //         PreparedStatement psmt = con.prepareStatement(query);
    //         psmt.setString(1, department);

    //         ResultSet rs = psmt.executeQuery();
    //         while (rs.next()) {
    //             System.out.println(rs.getString("first_name"));
    //         }

    //         rs.close();
    //     } catch (SQLException e) {
    //         e.printStackTrace();
    //     }
    // }
}