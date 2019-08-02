package com.covalense.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.common.EmpConstant;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@PropertySource(EmpConstant.PROP_FILENAME)
@Controller
@RequestMapping("/login")
/*
 * spring mvc: controller
 */

public class LoginController {
	// creating the hibernate Instance
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	/* ===========loginPage(sub Handler)=========== */

	// avoiding the Bind exception for date value
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateFormat = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);

		binder.registerCustomEditor(Date.class, dateFormat);
	}

	// getting the login page
	@GetMapping("/loginPage")
	public String getLoginForm() {

		return EmpConstant.VIEW_LOGIN_PAGE;
	}

	@PostMapping("/authenticate")
	public String authenticate(int id, String password, HttpServletRequest request
			                    ,@Value("${loginErrMessage}") String loginErrMessage) {

		EmployeeInfoBean bean = dao.getEmployeeInfo(id);

		// login validation
		if (bean != null & id == bean.getId() && password.equals(bean.getPassword())) {

			HttpSession session = request.getSession(true);
			session.setAttribute("bean", bean);
			
			session.setAttribute("homeMsg", "successfully logged in");

			return EmpConstant.VIEW_HOME_PAGE;

		} else {
			request.setAttribute("logMsg", loginErrMessage);
			// forwarding the request to login page with error message
			return EmpConstant.VIEW_LOGIN_PAGE;

		} // end of else
	}// end of authenticate

	// getRegisterpage
	@GetMapping("/getRegisterPage")
	public String getRegisterPage() {

		return "empRegister";

	}

	// submitRegisterData
	@PostMapping("/submitRegisterData")
	public String submitRegisterData(EmployeeInfoBean empinfoBean, ModelMap map) {

	    
		if (dao.createEmployeeinfo(empinfoBean)) {
			map.addAttribute("errPswMsg", "Registration Finished Successfully");
			return EmpConstant.VIEW_LOGIN_PAGE;
		} else {
			map.addAttribute("errPswMsg", " Registration Failed ,Try again");
			return EmpConstant.VIEW_LOGIN_PAGE;
		} // end of else
	}// end submitRegisterData()

	/* ==============logout============ */
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap map,
			 @Value("${logoutErrMessage}") String logoutErrMessage) {
		
		session.invalidate();
		map.addAttribute("logMsg", logoutErrMessage);
		return EmpConstant.VIEW_LOGIN_PAGE;//loginPage.jsp
	}

	 

}// end of class
