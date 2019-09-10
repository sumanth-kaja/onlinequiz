package com.wipro.OQA1.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wipro.OQA1.bean.Deletebean;
import com.wipro.OQA1.util.DBUtil;

public class DeleteDao 
{
public int Deletedao(Deletebean bean)
{
	Connection con=DBUtil.getConnection();
	String sql="delete from C_programing where question=? ";
	
	try {
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, bean.getQuestion());
		int temp=ps.executeUpdate();
		return temp;
	}
	catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
	return 0;
}
}
