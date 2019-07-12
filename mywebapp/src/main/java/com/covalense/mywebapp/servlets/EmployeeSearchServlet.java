package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/search")
/*
 * servlet- searching the employee records,
 *and displaying data to html page 
 */
public class EmployeeSearchServlet   extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String idValue=req.getParameter("id");
		
		//interact with db 
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean=dao.getEmployeeInfo(idValue);
		
		//send the response to browser
		PrintWriter out=resp.getWriter();
		
		if(bean==null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:red\">Emplpoyee Not Fount!!!</span></H1>");
			out.print("<BR><br>");
			out.print("</BODY>");
			out.print("</HTML>");
		}else {
			
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:Blue\">Emplpoyee Fount...</span></H1>");
			out.print("<br>");
			out.print("<br>Id :" + bean.getId());
			out.print("<br>name :" + bean.getName());
			out.print("<br>phone :" + bean.getPhone());
			out.print("<br>email:" + bean.getEmail());
			out.print("<br>gender:" + bean.getGender());
			out.print("<br>Designation :" + bean.getDesignation());
			out.print("<br>Salary :" + bean.getSalary());
			out.print("<br>AccountNumber :" + bean.getAccountNumber());
			out.print("<br>DepartmentId :" + bean.getDepartmentId());
			out.print("<br>ManagerId :" + bean.getManagerId());
			
			out.print("</BODY>");
			out.print("</HTML>");
			
		}//end of else
		
	}//end of  doGet()
	

}//end of class
