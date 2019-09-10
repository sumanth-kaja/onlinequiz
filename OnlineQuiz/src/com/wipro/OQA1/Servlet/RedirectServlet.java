package com.wipro.OQA1.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wipro.OQA1.bean.Redirectbean;
import com.wipro.OQA1.dao.RedirectDao;


public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public RedirectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		String userid = (String)session.getAttribute("uid");
		
		Redirectbean bean=new Redirectbean(userid);
		RedirectDao dao=new RedirectDao();
		String accesstype=dao.RedirectDao(bean);
		if(accesstype.equals("prf"))
		{
			response.sendRedirect("prof.jsp");
		}
		if(accesstype.equals("null"))
		{
			response.sendRedirect("stu.jsp");	
		}
		
	}

}
