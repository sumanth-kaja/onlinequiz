package com.wipro.OQA1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
static Connection con=null;
	
	public static Connection getConnection()
	{
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sumanth29");
			System.out.println("Connected");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		
		
		
		return con;
	}
	
	public static void main(String[] args) {
		getConnection();
	}
}
