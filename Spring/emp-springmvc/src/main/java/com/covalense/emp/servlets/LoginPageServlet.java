package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginpage")
/*
 * login page sevlet
 */
public class LoginPageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// cookie enable or not with dummyCookie
		Cookie dummyCookie = new Cookie("cokie", "01"); // cookie
		resp.addCookie(dummyCookie);// adding cookie in the response

		// validate the session
		HttpSession session = req.getSession(false);

		if (session == null) {
			// invlid session:generate login page with error info
			req.setAttribute("errPswMsg", "");
			req.getRequestDispatcher("login.jsp").forward(req, resp);

		} else {
			// valid session ;generate proper response

			req.getRequestDispatcher("./loginPage").forward(req, resp);

		}

	}// end of doget
}// end of class
