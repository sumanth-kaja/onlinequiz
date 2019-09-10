package com.wipro.OQA1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wipro.OQA1.bean.Logoutbean;
import com.wipro.OQA1.util.DBUtil;

public class LogoutDAO
{
 public int logoutDAO(Logoutbean bean)
 {
	 System.out.print("1");
	 Connection con = DBUtil.getConnection();
	 String sql = "update OQA_tbl_Login SET login_status=? where regid=?";
	 try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,"0");
		ps.setString(2,bean.getId());
		int temp = ps.executeUpdate();
		//System.out.print(temp);
		return temp;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return 0;
 }
}
