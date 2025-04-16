package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ThreadinJava {

    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/employees"; // Database name
        String user = "root"; // User ID
        String password = "V6pgrzme6k"; // Password

        // Using try-with-resources for automatic resource management
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // SQL statement to create the table
            String sql = "CREATE TABLE Registration (" +
                         "id INT NOT NULL, " +
                         "firstname VARCHAR(23), " +
                         "lastname VARCHAR(23), " +
                         "age INT NOT NULL, " +
                         "PRIMARY KEY (id))";

            // Execute the SQL statement
            stmt.executeUpdate(sql);
            System.out.println("Table 'Registration' created successfully.");

        } catch (SQLException e) {
            // Handle SQL exceptions
            System.err.println("SQLException: " + e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
            System.err.println("VendorError: " + e.getErrorCode());
        }
    }
}
