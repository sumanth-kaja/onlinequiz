package com.wipro.OQA1.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wipro.OQA1.util.DBUtil;

public class Displaydao 
{
public ResultSet DisplayDao1()
{

	
	Connection con=DBUtil.getConnection();
	String sql="select *from C_programing";
	try 
	{
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
			return rs;	
	}
	
	catch (SQLException e) 
	
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;

}

public ResultSet DisplayDao2()
{

	
	Connection con=DBUtil.getConnection();
	String sql="select *from Sql_programing";
	try 
	{
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
			return rs;	
	}
	
	catch (SQLException e) 
	
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;

}
public ResultSet DisplayDao3()
{

	
	Connection con=DBUtil.getConnection();
	String sql="select *from Python_programing";
	try 
	{
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
			return rs;	
	}
	
	catch (SQLException e) 
	
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;

}

public ResultSet DisplayDao4()
{

	
	Connection con=DBUtil.getConnection();
	String sql="select *from Java_programing";
	try 
	{
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
			return rs;	
	}
	
	catch (SQLException e) 
	
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;

}

public ResultSet DisplayDao5()
{

	
	Connection con=DBUtil.getConnection();
	String sql="select *from Css_programing";
	try 
	{
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
			return rs;	
	}
	
	catch (SQLException e) 
	
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;

}

public ResultSet DisplayDao6()
{

	
	Connection con=DBUtil.getConnection();
	String sql="select *from Php_programing";
	try 
	{
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
			return rs;	
	}
	
	catch (SQLException e) 
	
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;

}

public ResultSet DisplayDao7()
{

	
	Connection con=DBUtil.getConnection();
	String sql="select *from Cplus_programing";
	try 
	{
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
			return rs;	
	}
	
	catch (SQLException e) 
	
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;

}

public ResultSet DisplayDao8()
{

	
	Connection con=DBUtil.getConnection();
	String sql="select *from R_programing";
	try 
	{
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
			return rs;	
	}
	
	catch (SQLException e) 
	
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;

}
}
