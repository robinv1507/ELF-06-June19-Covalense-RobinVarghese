package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@WebServlet("/createemployee")
/*
 * servlet- creating the employee records,
 *and displaying data to html page 
 */
public class CreateEmployeeServlet   extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//interact with db 
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		
		EmployeeInfoBean bean=new EmployeeInfoBean();
		
		SimpleDateFormat form=new SimpleDateFormat("yyyy-mm-dd");
		bean.setId(Integer.parseInt(req.getParameter("empid")));
		bean.setGender(req.getParameter("gender"));
		bean.setAccountNumber(Long.parseLong(req.getParameter("accountno")));
		bean.setAge(Integer.parseInt(req.getParameter("age")));
		bean.setDepartmentId(Integer.parseInt(req.getParameter("departmentid")));
		bean.setDesignation(req.getParameter("designation"));
		bean.setEmail(req.getParameter("email"));
		bean.setName(req.getParameter("name"));
		bean.setSalary(Long.parseLong(req.getParameter("salary")));
		bean.setPhone(Long.parseLong(req.getParameter("phoneno")));
		bean.setManagerId(Integer.parseInt(req.getParameter("managerid")));
		bean.setPassword(req.getParameter("password"));
		
		try {
			bean.setDob(form.parse(req.getParameter("dob")));
			bean.setJoiningDate(form.parse(req.getParameter("dob")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//send the response to browser
		PrintWriter out=resp.getWriter();
		
		if(dao.createEmployeeinfo(bean)) {
			
			out.print("<HTML>");
			
			out.print("<BODY>");

				out.print("<BR><br>");
				 req.getRequestDispatcher("index.html").include(req, resp);
				 out.print("<H2><span style=\"color:red;top: 137px;left: 617px;font-size: 16px;font-family: cursive;position: absolute;\"> Registration Finished Successfully</span></H2>");
				out.print("</BODY>");
				out.print("</HTML>");
		}else{
               out.print("<HTML>");
			   out.print("<BODY>");
			   out.print("<BR><br>");
				req.getRequestDispatcher("index.html").include(req, resp);
				out.print("<H2><span style=\"color:red;top: 137px;left: 617px;font-size: 16px;font-family: cursive;position: absolute;\"> Registration Failed</span></H2>");
				out.print("</BODY>");
				out.print("</HTML>");
		}	
	}//end of  doPost()
	

}//end of class
