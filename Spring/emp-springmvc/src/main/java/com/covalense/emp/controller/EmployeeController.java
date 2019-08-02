package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.common.EmpConstant;
import com.covalense.emp.dao.EmployeeDAO;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	// creating the hibernate Instance
	@Autowired
	@Qualifier(EmpConstant.DB_TYPE)
	EmployeeDAO dao;

	/* ===========search====================== */
	@GetMapping("/search")
	public String search(HttpServletRequest req, ModelMap map, @RequestParam String id) {

		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		map.addAttribute("bean", bean);

		return "employeeList";
	}// end of search()

}
