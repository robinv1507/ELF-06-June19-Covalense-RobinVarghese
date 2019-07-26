package com.covalense.emp.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.beans.EmployeeOtherInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@WebServlet("/createemployee")
/*
 * servlet- Register page servlet : creating the employee records
 *
 */
public class CreateEmployeeServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			// creating the hibernate Instance
			EmployeeDAO dao = EmployeeDAOFactory.getInstance();

			// interact with db: setting the value toEmployeeInfoBean
			EmployeeInfoBean bean = new EmployeeInfoBean();

			SimpleDateFormat form = new SimpleDateFormat("yyyy-mm-dd");
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
			/*
			 * ======================EmployeeOtherInfoBean==================================
			 * ========
			 */
			// interact with db: setting the value to EmployeeOtherInfoBean
			EmployeeOtherInfoBean otherInfo = new EmployeeOtherInfoBean();
			otherInfo.setId(Integer.parseInt(req.getParameter("empid")));
			otherInfo.setAdhar(Long.parseLong(req.getParameter("adhar")));
			otherInfo.setBloodGrp(req.getParameter("bgroup"));
			otherInfo.setChallenged(Boolean.parseBoolean(req.getParameter("isChallenged")));
			otherInfo.setEmergencyContactName(req.getParameter("em_contact_name"));
			otherInfo.setEmergencyContactNumber(Long.parseLong(req.getParameter("em_contact_no")));
			otherInfo.setFatherName(req.getParameter("father_name"));
			otherInfo.setPan(req.getParameter("pan_no"));
			otherInfo.setIsmarried(Boolean.parseBoolean(req.getParameter("isChallenged")));
			otherInfo.setMotherName(req.getParameter("mather_name"));
			otherInfo.setNationality(req.getParameter("nationality"));
			otherInfo.setSpouseName(req.getParameter("spouse_name"));
			otherInfo.setReligion(req.getParameter("religion"));
			bean.setOtherInfo(otherInfo);
			/* ======================== condition for Registration==================== */
			if (dao.createEmployeeinfo(bean)) {

				req.setAttribute("errPswMsg", "Registration Finished Successfully");
				// forwarding the request to login page with success message
				req.getRequestDispatcher("login.jsp").forward(req, resp);

			} else {
				req.setAttribute("errPswMsg", " Registration Failed ,Try again");
				// forwarding the request to login page with error message
				req.getRequestDispatcher("login.jsp").forward(req, resp);

			}
		} catch (NumberFormatException e) {
			req.setAttribute("errPswMsg", " Registration Failed ,Try again");
			// forwarding the request to login page with error message
			req.getRequestDispatcher("login.jsp").forward(req, resp);
			
		}
	}// end of doPost()

}// end of class
