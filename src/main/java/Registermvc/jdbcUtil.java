package Registermvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcUtil {

	static 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Driver is Registered");
	}
	
	public static Connection getConnection() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/registration_db";
		String user = "root";
		String password = "mysqlpass";
		
		return DriverManager.getConnection(url, user, password);
	}
	
	public static void closeResource (Connection connect, Statement stmt) throws SQLException
	{
		if(connect!=null)
			connect.close();
		if(stmt!=null)
			stmt.close();
	}
	
}
