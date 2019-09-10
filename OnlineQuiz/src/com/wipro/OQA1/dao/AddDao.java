package com.wipro.OQA1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.wipro.OQA1.bean.Addbean;
import com.wipro.OQA1.util.DBUtil;

public class AddDao {
	

	public int AddDao1(Addbean bean)
	{
	Connection con=DBUtil.getConnection();
	
	String query="insert into C_programing values(?,?,?,?,?,?)";
	
	try {
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1 ,bean.getQuestion());
		ps.setString(2,bean.getOption1());
		ps.setString(3,bean.getOption2());
		ps.setString(4, bean.getOption3());
		ps.setString(5, bean.getOption4());
		ps.setString(6, bean.getCrtans());
		
		int temp=ps.executeUpdate();
		System.out.println(temp);
		return temp;
	}
	catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}

		
	return 0;	

}
	public int AddDao2(Addbean bean)
	
	{
	Connection con=DBUtil.getConnection();
	
	String query="insert into Sql_programing values(?,?,?,?,?,?)";
	
	try {
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1 ,bean.getQuestion());
		ps.setString(2,bean.getOption1());
		ps.setString(3,bean.getOption2());
		ps.setString(4, bean.getOption3());
		ps.setString(5, bean.getOption4());
		ps.setString(6, bean.getCrtans());
		
		int temp=ps.executeUpdate();
		System.out.println(temp);
		return temp;
	}
	catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}

		
	return 0;	

}

	public int AddDao3(Addbean bean)
	{
	Connection con=DBUtil.getConnection();
	
	String query="insert into Python_programing values(?,?,?,?,?,?)";
	
	try {
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1 ,bean.getQuestion());
		ps.setString(2,bean.getOption1());
		ps.setString(3,bean.getOption2());
		ps.setString(4, bean.getOption3());
		ps.setString(5, bean.getOption4());
		ps.setString(6, bean.getCrtans());
		
		int temp=ps.executeUpdate();
		System.out.println(temp);
		return temp;
	}
	catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}

		
	return 0;	

}

	public int AddDao4(Addbean bean)
	{
	Connection con=DBUtil.getConnection();
	
	String query="insert into Java_programing values(?,?,?,?,?,?)";
	
	try {
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1 ,bean.getQuestion());
		ps.setString(2,bean.getOption1());
		ps.setString(3,bean.getOption2());
		ps.setString(4, bean.getOption3());
		ps.setString(5, bean.getOption4());
		ps.setString(6, bean.getCrtans());
		
		int temp=ps.executeUpdate();
		System.out.println(temp);
		return temp;
	}
	catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}

		
	return 0;	

}
	
	public int AddDao5(Addbean bean)
	{
	Connection con=DBUtil.getConnection();
	
	String query="insert into Css_programing values(?,?,?,?,?,?)";
	
	try {
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1 ,bean.getQuestion());
		ps.setString(2,bean.getOption1());
		ps.setString(3,bean.getOption2());
		ps.setString(4, bean.getOption3());
		ps.setString(5, bean.getOption4());
		ps.setString(6, bean.getCrtans());
		
		int temp=ps.executeUpdate();
		System.out.println(temp);
		return temp;
	}
	catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}

		
	return 0;	

}
	
	public int AddDao6(Addbean bean)
	{
	Connection con=DBUtil.getConnection();
	
	String query="insert into Php_programing values(?,?,?,?,?,?)";
	
	try {
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1 ,bean.getQuestion());
		ps.setString(2,bean.getOption1());
		ps.setString(3,bean.getOption2());
		ps.setString(4, bean.getOption3());
		ps.setString(5, bean.getOption4());
		ps.setString(6, bean.getCrtans());
		
		int temp=ps.executeUpdate();
		System.out.println(temp);
		return temp;
	}
	catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}

		
	return 0;	

}
	
	public int AddDao7(Addbean bean)
	{
	Connection con=DBUtil.getConnection();
	
	String query="insert into Cplus_programing values(?,?,?,?,?,?)";
	
	try {
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1 ,bean.getQuestion());
		ps.setString(2,bean.getOption1());
		ps.setString(3,bean.getOption2());
		ps.setString(4, bean.getOption3());
		ps.setString(5, bean.getOption4());
		ps.setString(6, bean.getCrtans());
		
		int temp=ps.executeUpdate();
		System.out.println(temp);
		return temp;
	}
	catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}

		
	return 0;	

}
	
	public int AddDao8(Addbean bean)
	{
	Connection con=DBUtil.getConnection();
	
	String query="insert into R_programing values(?,?,?,?,?,?)";
	
	try {
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1 ,bean.getQuestion());
		ps.setString(2,bean.getOption1());
		ps.setString(3,bean.getOption2());
		ps.setString(4, bean.getOption3());
		ps.setString(5, bean.getOption4());
		ps.setString(6, bean.getCrtans());
		
		int temp=ps.executeUpdate();
		System.out.println(temp);
		return temp;
	}
	catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}

		
	return 0;	

}
}