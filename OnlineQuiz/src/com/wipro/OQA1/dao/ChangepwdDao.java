package com.wipro.OQA1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.wipro.OQA1.bean.Changepwdbean;
import com.wipro.OQA1.util.DBUtil;

public class ChangepwdDao 
{
	public int ChangepwdUser(Changepwdbean bean)
	{
		System.out.print("hello");
		Connection con=DBUtil.getConnection();
		
		String query="update OQA_tbl_Login SET password=? where regid=? AND password=?";
		
		
		try {
			
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, bean.getNew_password());
			ps.setString(2, bean.getRegId());
			ps.setString(3, bean.getOld_password());
			String new1=bean.getNew_password();
			String new2=bean.getOld_password();
			String new3=bean.getRegId();
			int temp=ps.executeUpdate();
			System.out.println("value"+temp+" "+new1+" "+new2+" "+new3);
			return temp;
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
		
	}

}
