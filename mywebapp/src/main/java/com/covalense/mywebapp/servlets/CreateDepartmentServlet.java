package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeDepartmentInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/createDepartment")
/*
 * servlet- creating the Department records in db
 *
 */
public class CreateDepartmentServlet   extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//interact with db 
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		
	   EmployeeDepartmentInfoBean   bean=new EmployeeDepartmentInfoBean();
		
		bean.setDeptId(Integer.parseInt(req.getParameter("deptid")));
		bean.setDeptName(req.getParameter("deptname"));
		//send the response to browser
		PrintWriter out=resp.getWriter();
		
		if(dao.createDepartmentinfo(bean)) {
			
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:Blue\"> Department records inserted</span></H1>");
			out.print("<br>");
			out.print("</BODY>");
			out.print("</HTML>");
		}else{
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:red\"> No Department records inserted/span></H1>");
			out.print("<br>");
			out.print("</BODY>");
			out.print("</HTML>");
		}
		
	}//end of  doPost()
	

}//end of class
