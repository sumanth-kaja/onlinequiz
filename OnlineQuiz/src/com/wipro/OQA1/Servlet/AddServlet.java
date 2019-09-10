package com.wipro.OQA1.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wipro.OQA1.bean.Addbean;
import com.wipro.OQA1.dao.AddDao;


public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		String Question=request.getParameter("1");
		String Option1=request.getParameter("o1");
		String Option2=request.getParameter("o2");
		String Option3=request.getParameter("o3");
		String Option4=request.getParameter("o4");
		String Crtans=request.getParameter("Cort");
	
		
		Addbean quesbean=new Addbean(Question,Option1,Option2,Option3,Option4,Crtans);
		AddDao Dao= new AddDao();
		
		int temp=0;
		HttpSession session = request.getSession();
		String value = (String)session.getAttribute("subject");
		if(value.equals("C"))
		{
			temp=Dao.AddDao1(quesbean);
		}
		if(value.equals("sql"))
		{
			temp=Dao.AddDao2(quesbean);
		}
		if(value.equals("python"))
		{
			temp=Dao.AddDao3(quesbean);
		}
		if(value.equals("java"))
		{
			temp=Dao.AddDao4(quesbean);
		}
		if(value.equals("css"))
		{
			temp=Dao.AddDao5(quesbean);
		}
		if(value.equals("php"))
		{
			temp=Dao.AddDao6(quesbean);
		}
		if(value.equals("c++"))
		{
			temp=Dao.AddDao7(quesbean);
		}
		if(value.equals("r"))
		{
			temp=Dao.AddDao8(quesbean);
		}
		
		
		if(temp==1)
		{
		 	response.sendRedirect("prof.jsp");
		}
		
	}

}
