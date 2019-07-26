package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.emp.beans.EmployeeInfoBean;

@WebServlet("/profileHome")
public class ProfilePicServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

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

			EmployeeInfoBean bean = (EmployeeInfoBean) session.getAttribute("data");
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
			out.print(" </html>     ");

		}

	}

}//end of class
