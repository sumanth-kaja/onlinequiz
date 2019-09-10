package com.wipro.OQA1.Servlet;
import java.io.IOException;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wipro.OQA1.dao.Displaydao;

public class Displayservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		 Displaydao dao=new Displaydao();
		 
		 HttpSession session = request.getSession();
		 String value = (String)session.getAttribute("subject");
		 
		 System.out.println(value);
		 
		 if(value.equals("C"))
			{
			 ResultSet rs1=dao.DisplayDao1();
			 request.setAttribute("obj",rs1);
			 request.getRequestDispatcher("View.jsp").include(request, response);
			}
			if(value.equals("sql"))
			{
				 ResultSet rs1=dao.DisplayDao2();
				 request.setAttribute("obj",rs1);
				 request.getRequestDispatcher("View.jsp").include(request, response);
			}
			if(value.equals("python"))
			{
				 ResultSet rs1=dao.DisplayDao3();
				 request.setAttribute("obj",rs1);
				 request.getRequestDispatcher("View.jsp").include(request, response);
			}
			if(value.equals("java"))
			{
				 ResultSet rs1=dao.DisplayDao4();
				 request.setAttribute("obj",rs1);
				 request.getRequestDispatcher("View.jsp").include(request, response);
			}
			if(value.equals("css"))
			{
				 ResultSet rs1=dao.DisplayDao5();
				 request.setAttribute("obj",rs1);
				 request.getRequestDispatcher("View.jsp").include(request, response);
			}
			if(value.equals("php"))
			{
				 ResultSet rs1=dao.DisplayDao6();
				 request.setAttribute("obj",rs1);
				 request.getRequestDispatcher("View.jsp").include(request, response);
			}
			if(value.equals("c++"))
			{
				 ResultSet rs1=dao.DisplayDao7();
				 request.setAttribute("obj",rs1);
				 request.getRequestDispatcher("View.jsp").include(request, response);
			}
			if(value.equals("r"))
			{
				 ResultSet rs1=dao.DisplayDao8();
				 request.setAttribute("obj",rs1);
				 request.getRequestDispatcher("View.jsp").include(request, response);
			}
			
		 
			 ResultSet rs1=dao.DisplayDao2();
			 request.setAttribute("obj",rs1);
			 request.getRequestDispatcher("View.jsp").include(request, response);
		 }

}
