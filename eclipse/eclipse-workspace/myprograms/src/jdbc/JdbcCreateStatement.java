package jdbc;  

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class JdbcCreateStatement
{
		public static void main(String[] args)
		{
			// Database connection parameters
			String url = "jdbc:mysql://localhost:3306/employees";
			String user = "root";
			String password = "V6pgrzme6k";
			 try 
			 {				 
    		Connection conn = DriverManager.getConnection(url, user, password);
			Statement stmt=conn.createStatement();
			String sql="insert into ExampleTable values(123,'ram',40, 'HII')";
			stmt.executeUpdate(sql);
			 sql="insert into ExampleTable values(133,'george',60,'jjI')";
			stmt.executeUpdate(sql);
		    System.out.println("Record inserted successfully");
			 }
			 catch(SQLException e)
			 {
				 System.out.println(e);
			 }
		}
}
