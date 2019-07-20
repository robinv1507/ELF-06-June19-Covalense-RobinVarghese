package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookie")
public class ReadCookieServlet extends HttpServlet {
   
	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) 
					throws ServletException, IOException {
		
		//get the cookies from request
		
		Cookie[] receivedCookies=req.getCookies();
	
		PrintWriter out=resp.getWriter();
		
		if(receivedCookies==null) {
		out.print("Cookies are not present !!");
		}else {
			out.print("Cookies are present !!");
			for(Cookie rcvdCookie : receivedCookies) {
				out.print("Cookie name: "+rcvdCookie.getName());
				out.print("Cookie value: "+rcvdCookie.getValue());
			
			}//end of for
		}//end of else
	         
	}//end of doGet()

}//end of class
