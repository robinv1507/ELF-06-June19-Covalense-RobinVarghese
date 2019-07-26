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

		// invalidate the session

		HttpSession session = req.getSession(false);
		if (session != null) {
			session.invalidate();
		}

		req.setAttribute("errPswMsg", "Successfully  Logged out");
		// forwarding the request to login page with error message
		req.getRequestDispatcher("login.jsp").forward(req, resp);

	}

}// end of class
