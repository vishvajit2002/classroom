package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcPrepare {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "V6pgrzme6k";

        // Using try-with-resources to ensure proper resource management
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO ExampleTable VALUES (?, ?, ?, ?)")) {

            // Set parameters for the prepared statement
            stmt.setInt(1, 11);
            stmt.setString(2, "Ratan");
            stmt.setInt(3, 43);
            stmt.setString(4, "male");

            // Execute the update and get the number of affected records
            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");

        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
