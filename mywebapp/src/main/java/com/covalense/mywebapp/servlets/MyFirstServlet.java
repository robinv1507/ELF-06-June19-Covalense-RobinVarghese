package com.covalense.mywebapp.servlets;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log
/*
 * Servlet demo 
 */
public  class MyFirstServlet extends HttpServlet {
	@Override

	protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext ctx=getServletContext();
		String movieName=ctx.getInitParameter("movie");
		
		ServletConfig config=getServletConfig();
		String actorName=config.getInitParameter("actor");
		
		String currentDateTime=new Date().toString();
		//get query string info
		String fnamevalue=req.getParameter("fname");
		String lnamevalue=req.getParameter("lname");
		String htmlresponse="<!DOCTYPE html>"+
								"<html>"+
								"<head>"+
								"<meta charset=\"ISO-8859-1\">"+
								"<title>My first page</title>"+
								"</head>"+
								"<body>"+
								 "<h1>Current Date & Time is : <span style=\"color: blue\">"+currentDateTime+"</span></h1><br><br>"+
								"<h2>Name :"+fnamevalue +"  "+ lnamevalue+"</h2><br>"+
								"<h3>Movie Name :"+movieName +"<br> Actor "+ actorName+"</h3><br>"+
								
								"</body>"+
								"</html>";
		//send the above  HTMl response to browser
		resp.setContentType("text/html");
		//resp.setHeader("Refresh","1");//auto refresh
		PrintWriter out=resp.getWriter();
		out.print(htmlresponse);
		//================================================================
		//Get the object from forward servlet
		//EmployeeInfoBean empInfo=(EmployeeInfoBean)req.getAttribute("info");
		EmployeeInfoBean empInfo=(EmployeeInfoBean)ctx.getAttribute("info");
		if(empInfo==null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:red\">EmplpoyeeBean object Not Fount!!!</span></H1>");
			out.print("<BR><br>");
			out.print("</BODY>");
			out.print("</HTML>");
		}else {
			
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:Blue\">EmplpoyeeBean object  Fount...</span></H1>");
			out.print("<br>");
			out.print("<br>Id :" + empInfo.getId());
			out.print("<br>name :" + empInfo.getName());
			out.print("<br>email:" + empInfo.getEmail());
			
			out.print("</BODY>");
			out.print("</HTML>");
			
		}//end of else
		
						
		
	}//end of doGet()
	
}//end of class
