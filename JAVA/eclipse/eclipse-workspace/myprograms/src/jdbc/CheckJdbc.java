package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckJdbc
{
	//static String user = "root";
	//static String pass = V6pgrzme6k;

	public static void main(String[] args)
	{

		try
		{
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","V6pgrzme6k");
			System.out.println("Connection connected");
		} catch (SQLException ex)
		{
			System.err.println("SQLException:" + ex.getMessage());
			System.err.println("SQLState:" + ex.getSQLState());
			System.err.println("VendorError:" + ex.getErrorCode());
		}
	}
}