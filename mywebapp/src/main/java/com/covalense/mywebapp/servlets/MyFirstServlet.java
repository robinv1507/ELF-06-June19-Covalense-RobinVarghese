package com.covalense.mywebapp.servlets;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.java.Log;
@Log
/*
 * Servlet demo 
 */
public  class MyFirstServlet extends HttpServlet {
	public MyFirstServlet() {
		System.out.println("my constructor:");
	}
	
	@Override

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		String httpMethod=req.getMethod();
		String protocol=req.getProtocol();
		String requestUrl=req.getRequestURL().toString();
		
		log.info("httpMethod :"+httpMethod);
		log.info("protocol :"+protocol);
		
		log.info("requestUrl :"+requestUrl);
		
		
		
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
								"<h2>Name :"+fnamevalue +"  "+ lnamevalue+"</h2>"+
								"</body>"+
								"</html>";
		//send the above  HTMl response to browser
		resp.setContentType("text/html");
		//resp.setHeader("Refresh","1");//auto refresh
		PrintWriter out=resp.getWriter();
		out.print(htmlresponse);
		
						
		
	}//end of doGet()
	
}//end of class
