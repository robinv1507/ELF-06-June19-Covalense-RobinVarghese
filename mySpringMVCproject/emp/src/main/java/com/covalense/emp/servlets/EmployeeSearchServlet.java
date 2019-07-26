package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@WebServlet("/searchEmployee")

/*
 * servlet- searching the employee records, and displaying data to html page
 */
public class EmployeeSearchServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		// validate the session-get the current session object
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

			int idValue = Integer.parseInt(req.getParameter("empid"));

			// interact with db
			EmployeeDAO dao = EmployeeDAOFactory.getInstance();
			List<EmployeeInfoBean> bean = dao.getSearchEmployeeInfo(idValue);

			// send the response to browser

			if (bean == null) {
				out.print("<HTML>");
				out.print("<BODY>");
				out.print("<H1><span style=\"color:red\">Emplpoyee Not Fount!!!</span></H1>");
				out.print("<BR><br>");
				out.print("</BODY>");
				out.print("</HTML>");
			} else {
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
				out.print("<H1><span style=\"color:Blue\">Emplpoyee Fount...</span></H1>");

				out.print(
						"         <div class=\"card \" style=\"width: 18rem;width: 29rem; position: absolute;  top: 191px; left: 185px;\">  ");
				out.print(
						"           <div class=\"card-header\">Employee Details</div>                                                     ");
				out.print(
						"           <div class=\"card-body\"     style=\"padding:2.25rem;\">                                                ");
				out.print(
						"                                                                                                               ");
				for (EmployeeInfoBean empids : bean) {
					out.print("            <a href=\"./home?id=" + empids.getId()
							+ "\"><h6 class=\"card-subtitle mb-2 text-muted\">Emp Id  :" + empids.getId()
							+ "</h6></a><br>                                          ");
				}
				out.print(
						"           </div>                                                                                              ");
				out.print(
						"         </div>                                                                                                ");

				out.print(
						"                                                                                                               ");
				out.print(
						" </body>                                                                                                       ");
				out.print(" </html>                                                                      ");

			} // end of else

		} // end of else
	}// end of doGet()

}// end of class
