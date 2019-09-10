package com.wipro.OQA1.Servlet;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.OQA1.bean.Deletebean;
import com.wipro.OQA1.dao.DeleteDao;
import com.wipro.OQA1.dao.Displaydao;


public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteServlet() {
        super();

    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			String option =request.getParameter("delete");
			DeleteDao dao=new DeleteDao();
			
			
			
			if(option.equals("Delete questions"))
			{
				
				
				 ResultSet rs1=dao.DisplayDao();
				 request.setAttribute("obj",rs1);
				 request.getRequestDispatcher("Delete.jsp").include(request, response); 
			}
			else if(option.equals("DeleteQuestion"))
			{
				String delquestion=request.getParameter("question");
				Deletebean bean=new Deletebean(delquestion);
				
				int temp=dao.Deletedao(bean);
				if(temp==1)
				{
					response.sendRedirect("prof.jsp");
				}
			
				
				
			}
		 
	}

}
