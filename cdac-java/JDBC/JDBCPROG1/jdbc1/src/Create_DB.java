import java.io.*;
import java.sql.*;

public class Create_DB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/org";
            String username = "root";
            String password = "Nisha@123";

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established successfully");


            Statement stmt = con.createStatement();
            String query = "select * from worker";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + "    " + rs.getString(2) + " " + rs.getString(3) + "    " + rs.getString(6));
            }

            rs.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to database.");
            e.printStackTrace();
        }
    }
}