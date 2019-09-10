package com.wipro.OQA1.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.OQA1.bean.deleteb;
import com.wipro.OQA1.dao.deleted;


public class deleteservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public deleteservlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String question=request.getParameter("1");
		String option1=request.getParameter("Q1");
		String option2=request.getParameter("Q2");
		String option3=request.getParameter("Q3");
		String option4=request.getParameter("Q4");
		String cort=request.getParameter("Cort");
		PrintWriter pw=response.getWriter();
		pw.print(option1);
		deleteb deletebean=new deleteb(question,option1,option2,option3,option4,cort);
		
		int temp=0;
	
		deleted dao=new deleted();
		dao.deleted1(deletebean);
		
		
		
	}

}
