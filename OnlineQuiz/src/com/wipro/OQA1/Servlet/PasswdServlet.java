package com.wipro.OQA1.Servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.OQA1.bean.Changepwdbean;
import com.wipro.OQA1.dao.ChangepwdDao;

public class PasswdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public PasswdServlet() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		 String regid=request.getParameter("Regid");
			
			String newpass=request.getParameter("npwd");
			String oldpass=request.getParameter("cpwd");
			// System.out.print(regid+" "+newpass+" "+oldpass);
			
			Changepwdbean changebean= new Changepwdbean(regid,newpass,oldpass);
			ChangepwdDao dao=new ChangepwdDao();
			 int temp1=dao.ChangepwdUser(changebean);
			 System.out.print(temp1);
			if(temp1==1)
			{
				// System.out.print("updated");
				response.sendRedirect("Login.jsp");
			}
			else
			{
				//System.out.print(" not updated");
				response.sendRedirect("changepasswd.jsp");
			}
			
			

	
	}

}
