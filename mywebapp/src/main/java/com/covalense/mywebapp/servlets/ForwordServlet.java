package com.covalense.mywebapp.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
@WebServlet("/forward")
public class ForwordServlet extends HttpServlet {
     
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		EmployeeInfoBean infoBean=new EmployeeInfoBean();
		infoBean.setId(13);
		infoBean.setName("praveen");
		infoBean.setEmail("prv@gmail.com");
		//pass the above Object to Employeesearchservlet
		//request.setAttribute("info",infoBean);
		ServletContext ctx=getServletContext();
		ctx.setAttribute("info",infoBean);
		
		String url="search?id=2";
		//String url="https://www.google.com";
	
		RequestDispatcher dispatcher=request.getRequestDispatcher(url);
		dispatcher.forward(request, response);

	         
	
	}//end of doGet()

}//end of class
