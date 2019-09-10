package com.wipro.OQA1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.wipro.OQA1.bean.deleteb;
import com.wipro.OQA1.util.DBUtil;

public class deleted {

	public int deleted1(deleteb bean){
		
		Connection con=DBUtil.getConnection();
		
		String sql="insert into Question_Q values(?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, bean.getQuestion());
			ps.setString(2, bean.getOption1());
			ps.setString(3, bean.getOption2());
			ps.setString(4, bean.getOption3());
			ps.setString(5, bean.getOption4());
			ps.setString(6, bean.getCort());
			
			int temp=ps.executeUpdate();
			System.out.println(temp);
			return temp;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
				
		
		return 0;
	}
}
