package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/myGeneric")
public class MyGenericServlet extends GenericServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<HTML>");
		out.print("<BODY>");
		out.print("<H1><span style=\"color:blue\">welcome to world of servlets!!!</span></H1>");
		out.print("<BR><br>");
		out.print("</BODY>");
		out.print("</HTML>");
	}//end of service

}//end of class
