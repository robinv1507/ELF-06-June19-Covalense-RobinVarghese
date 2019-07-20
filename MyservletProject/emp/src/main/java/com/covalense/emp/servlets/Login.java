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

@WebServlet("/home")
/*
 * servlet- creating the employee records, and displaying data to html page
 */
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		// check cookies are disabled or not
		if (req.getCookies() == null) {
			// invlid session:generate login page with error info
			out.print("<HTML>");
			out.print("<BODY>");

			out.print("<BR><br>");
			req.getRequestDispatcher("index.html").include(req, resp);
			out.print(
					"<H2><span style=\"color:red;top: 137px;left: 617px;font-size: 16px;font-family: cursive;position: absolute;\"> please Enabled the Browser Cookies </span></H2>");
			out.print("</BODY>");
			out.print("</HTML>");
			return;

		} else {

			int empId = Integer.parseInt(req.getParameter("empid"));
			String empPassword = req.getParameter("password");
			// interact with db
			EmployeeDAO dao = EmployeeDAOFactory.getInstance();
			EmployeeInfoBean bean = dao.getEmployeeInfo(empId);
			// login validation
			if (empId == bean.getId() && empPassword.equals(bean.getPassword())) {
				// create a session
				HttpSession session = req.getSession(true);
				session.setAttribute("data", bean);

				// set cookies to persisitence
				Cookie ck = new Cookie("JSESSIONID", session.getId()); // cookie
				ck.setMaxAge(7 * 24 * 60 * 60);// changing the maximum age to 7 days
				resp.addCookie(ck);// adding cookie in the response

				out.print(
						"           <!DOCTYPE html>                                                                                     ");
				out.print(
						" <html lang=\"en\">                                                                                              ");
				out.print(
						" <head>                                                                                                        ");
				out.print(
						"     <meta charset=\"UTF-8\">                                                                                    ");
				out.print(
						"     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">                                    ");
				;
				out.print(
						"     <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">                                                     ");
				out.print(
						"     <title>E M P</title>                                                                                      ");
				out.print(
						"     <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>                                                ");
				out.print(
						"     <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"    ");
				out.print(
						" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
				out.print(
						" </head>                                                                                                       ");
				out.print(
						" <body>                                                                                                        ");
				req.getRequestDispatcher("include/header.html").include(req, resp);
				req.getRequestDispatcher("include/sidebar.html").include(req, resp);
				out.print(
						"         <div class=\"card \" style=\"width: 18rem;width: 29rem; position: absolute;  top: 191px; left: 185px;\">  ");
				out.print(
						"           <div class=\"card-header\">Employee Details</div>                                                     ");
				out.print(
						"           <div class=\"card-body\"     style=\"padding:2.25rem;\">                                                ");
				out.print(
						"                                                                                                               ");
				out.print("             <h6 class=\"card-subtitle mb-2 text-muted\">Name : " + bean.getName()
						+ "</h6><br>                                         ");
				out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">Email  :" + bean.getEmail()
						+ "</h6><br>                                        ");
				out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">Phone no: " + bean.getPhone()
						+ "</h6><br>                                       ");
				out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">EmpId:" + bean.getId()
						+ "</h6><br>                                          ");
				out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">Age :" + bean.getAge()
						+ "</h6><br>                                           ");
				out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">Designation :"
						+ bean.getDesignation() + "</h6>                                       ");
				out.print(
						"           </div>                                                                                              ");
				out.print(
						"         </div>                                                                                                ");
				out.print(
						"                                                                                                               ");
				out.print(
						" </body>                                                                                                       ");
				out.print(
						" </html>                                                                                                       ");
			} else {

				out.print("<HTML>");
				out.print("<BODY>");

				out.print("<BR><br>");
				req.getRequestDispatcher("index.html").include(req, resp);
				out.print(
						"<H2><span style=\"color:red;top: 137px;left: 617px;font-size: 16px;font-family: cursive;position: absolute;\">Invalid user name Or Password</span></H2>");
				out.print("</BODY>");
				out.print("</HTML>");

			}
		} // else end

	}

	// doGet() for selected employees home
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		// validate the session
		HttpSession session = req.getSession(false);
		if (session == null) {
			// invlid session:generate login page with error info
			out.print("<HTML>");
			out.print("<BODY>");

			out.print("<BR><br>");
			req.getRequestDispatcher("index.html").include(req, resp);
			out.print(
					"<H2><span style=\"color:red;top: 137px;left: 617px;font-size: 16px;font-family: cursive;position: absolute;\">Invalid Session !! Please LogIn</span></H2>");
			out.print("</BODY>");
			out.print("</HTML>");

		} else {
			int idValue = Integer.parseInt(req.getParameter("id"));

			// interact with db

			EmployeeDAO dao = EmployeeDAOFactory.getInstance();
			EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);
			out.print(
					"           <!DOCTYPE html>                                                                                     ");
			out.print(
					" <html lang=\"en\">                                                                                              ");
			out.print(
					" <head>                                                                                                        ");
			out.print(
					"     <meta charset=\"UTF-8\">                                                                                    ");
			out.print(
					"     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">                                    ");
			;
			out.print(
					"     <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">                                                     ");
			out.print(
					"     <title>E M P</title>                                                                                      ");
			out.print(
					"     <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>                                                ");
			out.print(
					"     <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"    ");
			out.print(
					" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
			out.print(
					" </head>                                                                                                       ");
			out.print(
					" <body>                                                                                                        ");
			req.getRequestDispatcher("include/header.html").include(req, resp);
			req.getRequestDispatcher("include/sidebar.html").include(req, resp);
			out.print(
					"         <div class=\"card \" style=\"width: 18rem;width: 29rem; position: absolute;  top: 191px; left: 185px;\">  ");
			out.print(
					"           <div class=\"card-header\">Employee Details</div>                                                     ");
			out.print(
					"           <div class=\"card-body\"     style=\"padding:2.25rem;\">                                                ");
			out.print(
					"                                                                                                               ");
			out.print("             <h6 class=\"card-subtitle mb-2 text-muted\">Name : " + bean.getName()
					+ "</h6><br>                                         ");
			out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">Email  :" + bean.getEmail()
					+ "</h6><br>                                        ");
			out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">Phone no: " + bean.getPhone()
					+ "</h6><br>                                       ");
			out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">EmpId:" + bean.getId()
					+ "</h6><br>                                          ");
			out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">Age :" + bean.getAge()
					+ "</h6><br>                                           ");
			out.print("            <h6 class=\"card-subtitle mb-2 text-muted\">Designation :" + bean.getDesignation()
					+ "</h6>                                       ");
			out.print(
					"           </div>                                                                                              ");
			out.print(
					"         </div>                                                                                                ");
			out.print(
					"                                                                                                               ");
			out.print(
					" </body>                                                                                                       ");
			out.print(" </html>                         ");

		}

	}// end of doGet()

}// end ofn class
