package com.covalense.emp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@Controller
@RequestMapping("/employee")
/*
 * spring mvc: Dispatcher servlet 
 */
public class EmployeeController {
	
	/* ===========loginPage(controller)=========== */
	
	@GetMapping("/login")
	public String getLoginForm() {

		return "login";
	}
	@PostMapping("/submitForm")
	public String authenticate(int empId, String password, ModelMap map) {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(empId);

		// login validation
		if (bean != null & empId == bean.getId() && password.equals(bean.getPassword())) {
			
			map.addAttribute("bean", bean);
			
			return "home";

		} else {
			map.addAttribute("errPswMsg", "Invalid User name or Password");
			// forwarding the request to login page with error message
			return "login";

		}
	}

}
