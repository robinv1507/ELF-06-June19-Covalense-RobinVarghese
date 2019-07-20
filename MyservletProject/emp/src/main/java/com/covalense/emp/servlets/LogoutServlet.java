package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//invalidate the session
		
		HttpSession session=req.getSession(false);
		if(session!=null) {
			session.invalidate();
		}
		
		//printing the html login 
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.print("<HTML>");
		out.print("<BODY>");

		out.print("<BR><br>");
		req.getRequestDispatcher("index.html").include(req, resp);
		out.print(
				"<H2><span style=\"color:red;top: 137px;left: 617px;font-size: 16px;font-family: cursive;position: absolute;\">Successfully  Logged out</span></H2>");
		out.print("</BODY>");
		out.print("</HTML>");

	}

}
