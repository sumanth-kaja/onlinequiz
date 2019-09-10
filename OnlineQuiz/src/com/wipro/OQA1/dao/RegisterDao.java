package com.wipro.OQA1.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wipro.OQA1.bean.Registerbean;
import com.wipro.OQA1.util.DBUtil;

public class RegisterDao {
	Connection con=null;
	
	public RegisterDao() {
		
		 con=DBUtil.getConnection();
	}
	public int registerDao(Registerbean bean) 
	{
		Connection con=DBUtil.getConnection();
		String sql1="select register_status from OQA_tbl_Login where regid=? AND register_status=? AND seckey=?";
		String sql2="select regid from OQA_tbl_Professor where firstname=? AND lastname=? AND regid=? AND email=? ";
		String sql3="select regid from OQA_tbl_Student where firstname=? AND lastname=? AND regid=? AND email=?";
		String value="0";
		try 
		{
			PreparedStatement ps5=con.prepareStatement(sql1);
			PreparedStatement ps=con.prepareStatement(sql1);
			ps.setString(1, bean.getRegisterid());
			ps.setString(2,"0");
			ps.setString(3, bean.getSecretkey());
			ps5.setString(1, bean.getRegisterid());
			ps5.setString(2,"1");
			ps5.setString(3, bean.getSecretkey());
			int temp1=ps.executeUpdate();
			ResultSet rs=ps5.executeQuery();
			if(rs.next())
			{
				value=rs.getString("register_status");
				System.out.println(value+"value");
			}
			
			if(temp1==1 && value.equals("0"))
			{
				if(bean.getAccesstype().equals("professor"))
				{
					PreparedStatement ps1=con.prepareStatement(sql2);
					ps1.setString(1, bean.getFirstname());
					ps1.setString(2, bean.getLastname());
					ps1.setString(3, bean.getRegisterid());
					ps1.setString(4, bean.getEmail());
					int temp2=ps1.executeUpdate();
					if(temp2==1)
					{
						return 1;
					}
					else
					{
						return 2;
					}
					
				}
				else
				{
					if(bean.getAccesstype().equals("student"))
					{
						PreparedStatement ps3=con.prepareStatement(sql3);
						ps3.setString(1, bean.getFirstname());
						ps3.setString(2, bean.getLastname());
						ps3.setString(3, bean.getRegisterid());
						ps3.setString(4, bean.getEmail());
					
						int temp2=ps3.executeUpdate();
						if(temp2==1)
						{
							return 1;
						}
						else
						{
							return 5;
						}
					}
					
				}
			}
			else
			{
				if(value.equals("1"))
					return 3;
				else
					return 0;
			}
		} 
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 4;

	}
	public void UpdateDao(Registerbean bean)
	{
		String sql4="update OQA_tbl_Login SET register_status=?,password=? where regid=?";
		if(bean.getAccesstype().equals("professor"))
		{
			try
			{
			PreparedStatement ps2=con.prepareStatement(sql4);
			ps2.setString(1, "1");
			ps2.setString(2, bean.getPassword());
			ps2.setString(3, bean.getRegisterid());
			ps2.executeUpdate();
			}
			catch(SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
		{
			try
			{
			PreparedStatement ps4=con.prepareStatement(sql4);
			ps4.setString(1, "1");
			ps4.setString(2, bean.getPassword());
			ps4.setString(3, bean.getRegisterid());
			ps4.executeUpdate();
			}
			catch(SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		
	}
	}
}



