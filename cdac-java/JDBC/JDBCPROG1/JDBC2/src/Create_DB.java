import java.io.*;
import java.sql.*;
import java.util.*;

public class Create_DB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/org";
            String username = "root";
            String password = "Nisha@123";

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established successfully");

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the salary: ");
            double salary = sc.nextDouble();
            selectNamesBySalary(con, salary);

            System.out.println("Enter the department name: ");
            String department = sc.next();
            selectNamesByDepartment(con, department);

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectNamesBySalary(Connection con, double salary) {
        try {
            String query = "select first_name from worker where salary = ?";
            PreparedStatement psmt = con.prepareStatement(query);
            psmt.setDouble(1, salary);

            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("first_name"));
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectNamesByDepartment(Connection con, String department) {
        try {
            String query = "select first_name from worker where department = ?";
            PreparedStatement psmt = con.prepareStatement(query);
            psmt.setString(1, department);

            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("first_name"));
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

// import java.io.*;
// import java.sql.*;
// import java.util.*;

// public class Create_DB {
//     public static void main(String[] args) {
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             String url = "jdbc:mysql://localhost:3306/org";
//             String username = "root";
//             String password = "Nisha@123";

//             Connection con = DriverManager.getConnection(url, username, password);
//             System.out.println("Connection Established successfully");


//             String query = "select * from worker where department = ?";

//             PreparedStatement psmt = con.prepareStatement(query);

//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter the department name: ");
//             String department = sc.next();

//             psmt.setString(1, department);

//             ResultSet rs = psmt.executeQuery();
//             while (rs.next()) {
//                 System.out.println(rs.getInt(1) + "    " + rs.getString(2) + " " + rs.getString(3) + "    " + rs.getString(6));
//             }

//             rs.close();
//             con.close();



//         } catch (ClassNotFoundException e) {
//             System.out.println("MySQL JDBC Driver not found.");
//             e.printStackTrace();
//         } catch (SQLException e) {
//             System.out.println("Error connecting to database.");
//             e.printStackTrace();
//         }
//     }
// }