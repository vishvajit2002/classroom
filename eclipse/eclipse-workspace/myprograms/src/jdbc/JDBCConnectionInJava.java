package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionInJava {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "V6pgrzme6k";

        // Using try-with-resources for automatic resource management
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            String sql = "CREATE TABLE Registration (" +
                         "id INT NOT NULL, " +
                         "firstname VARCHAR(23), " +
                         "lastname VARCHAR(23), " +
                         "age INT NOT NULL, " +
                         "PRIMARY KEY (id))"; // Fixed SQL syntax

            stmt.executeUpdate(sql); // Use executeUpdate for DDL statements
            System.out.println("Table 'Registration' created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
