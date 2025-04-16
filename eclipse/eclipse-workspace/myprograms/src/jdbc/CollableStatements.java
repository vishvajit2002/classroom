package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CollableStatements
{

	public static void main(String[] args) 
	{
	        // Database connection parameters
	        String url = "jdbc:mysql://localhost:3306/employees";
	        String user = "root";
	        String password = "V6pgrzme6k";

	        // Using try-with-resources to ensure proper resource management
	        try
	        {
	        	Connection conn1 = DriverManager.getConnection(url, user, password);
	        	CallableStatement stmt=conn1.prepareCall("{call employees.INSERTR1(?,?,?,?)}");
	 	        stmt.setInt(1,243);
	 	    	stmt.setString(2,"arasu");
	 	    	stmt.setInt(3,243);
	 	    	stmt.setString(4,"rasu");
	 	        stmt.execute();//dml
	 	        System.out.println("records inserted");
	        }
	        catch(SQLException ex)
	        {
	        	System.out.println(ex);
	        }
	  }
	}
	       
	
