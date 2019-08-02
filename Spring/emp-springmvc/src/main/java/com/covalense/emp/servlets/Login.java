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

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@WebServlet("/loginPage")
/*
 * login page servlet
 */
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int empId;
		try {
			empId = Integer.parseInt(req.getParameter("empid"));

			String empPassword = req.getParameter("password");

			// interact with db
			EmployeeDAO dao = EmployeeDAOFactory.getInstance();
			EmployeeInfoBean bean = dao.getEmployeeInfo(empId);

			// login validation
			if (bean != null & empId == bean.getId() && empPassword.equals(bean.getPassword())) {
				// create a session
				HttpSession session = req.getSession(true);
				session.setAttribute("data", bean);
				// forwarding the request to home page
				req.getRequestDispatcher("home.jsp").forward(req, resp);

			} else {
				req.setAttribute("errPswMsg", "Invalid User name or Password");
				// forwarding the request to login page with error message
				req.getRequestDispatcher("login.jsp").forward(req, resp);

			}

		} catch (Exception e) {
			req.setAttribute("errPswMsg", "Invalid User name or Password");
			// forwarding the request to login page with error message
			req.getRequestDispatcher("login.jsp").forward(req, resp);

		}

	}// doPost()
}// end ofn class
