package com.wipro.OQA1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wipro.OQA1.bean.Redirectbean;
import com.wipro.OQA1.util.DBUtil;

public class RedirectDao 
{
public String RedirectDao(Redirectbean bean)
{
	Connection con=DBUtil.getConnection();
	
	String sql="select seckey from OQA_tbl_Login where regid=?";
	String accesstype="";
	try 
	{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,bean.getId());
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
		 accesstype=rs.getString("seckey");
		}
		
		return accesstype;
		
	} 
	catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return accesstype;
}
}
