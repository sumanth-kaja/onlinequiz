package com.wipro.OQA1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wipro.OQA1.bean.LoginBean;
import com.wipro.OQA1.util.DBUtil;

public class LoginDAO
{
	public int validateUser(LoginBean bean)
	{
		Connection con=DBUtil.getConnection();
		
		String sql="select regid from OQA_tbl_Login where regid=? AND password=? AND register_status=?";
		
		String sql1="update OQA_tbl_Login SET login_status=? where regid=?";
		
		try 
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,bean.getId());
			ps.setString(2, bean.getPasswd());
			ps.setString(3,"1");
			int temp=ps.executeUpdate();
			
			if(temp==1)
			{
				PreparedStatement ps1=con.prepareStatement(sql1);
				ps1.setString(1, "1");
				ps1.setString(2, bean.getId());
				ps1.executeUpdate();
			}
			return temp;
			
						
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		return 0;
}
}