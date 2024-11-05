import java.io.*;
import java.sql.*;

public class FirstJdbcProg {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/org";
            String username = "root";
            String password = "";

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to database.");
            e.printStackTrace();
        }
    }
}