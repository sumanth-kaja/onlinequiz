package com.wipro.OQA1.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wipro.OQA1.bean.Logoutbean;
import com.wipro.OQA1.dao.LogoutDAO;


public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LogoutServlet() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		String user = (String)session.getAttribute("uid");
		System.out.print("0");
		Logoutbean bean = new Logoutbean(user);
		LogoutDAO obj = new LogoutDAO();
		int temp =obj.logoutDAO(bean);
		if(temp==1) 
		{
			System.out.print("1");
			response.sendRedirect("Login.jsp");
		}
		else
		{
			System.out.print("0");
			response.sendRedirect("Logout.jsp");
		}
	}

}
