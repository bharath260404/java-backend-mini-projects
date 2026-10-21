package Registermvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
	int row=0;
    private PreparedStatement pstmt=null;
    private Connection connect=null;
	private String uname;
	private String upassword;
	private String email;
	private String ucity;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUcity() {
		return ucity;
	}
	public void setUcity(String ucity) {
		this.ucity = ucity;
	}
	
	
	public int register() 
	{   
		
		try {
	   	connect=jdbcUtil.getConnection();
	   	String sql = "INSERT INTO personalInfo (uname, email, upassword, ucity) VALUES (?, ?, ?, ?)";
	   pstmt =	connect.prepareStatement(sql);
	    pstmt.setString(1, uname);
	    pstmt.setString(2, email);
	    pstmt.setString(3, upassword);
	    pstmt.setString(4, ucity);

       row=pstmt.executeUpdate();

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				jdbcUtil.closeResource(connect, pstmt);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		
		return row;
		}
		
}
