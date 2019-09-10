package com.wipro.OQA1.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wipro.OQA1.bean.LoginBean;
import com.wipro.OQA1.bean.Redirectbean;
import com.wipro.OQA1.dao.LoginDAO;
import com.wipro.OQA1.dao.RedirectDao;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter out=response.getWriter();
		// get values from html
		String id=request.getParameter("userid");
		String passwd=request.getParameter("pwd");
		
		
		//make bean object
		LoginBean bean=new LoginBean(id,passwd);
		//invoke dao method
		LoginDAO dao=new LoginDAO();
		
		int temp1=dao.validateUser(bean);
		
		Redirectbean bean1=new Redirectbean(id);
		RedirectDao dao1=new RedirectDao();
		
		String accesstype=dao1.RedirectDao(bean1);
		
		
		if(temp1==1 && accesstype.equals("prf"))
		{
		response.sendRedirect("HomeProf.jsp");
		}
		else if(temp1==1 && accesstype.equals("null"))
		{
			response.sendRedirect("Home.jsp");
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Invalid Username or Password');");
			pw.println("</script>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response); 
			
			
		}
		HttpSession session = request.getSession();
		session.setAttribute("uid",id );
		
	}

}
