package com.covalense.emp.controller;

import java.text.SimpleDateFormat;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.common.EmpConstant;
import com.covalense.emp.dao.EmployeeDAO;


@RestController
@RequestMapping("/login")
/*
 * spring Rest: controller
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
	@PostMapping("/createEmployee")
	public  boolean createEmployee( EmployeeInfoBean empinfoBean) {

		return dao.createEmployeeinfo(empinfoBean);
	}
	
	@PutMapping("/updateEmployee")
	public  boolean updateEmployee( EmployeeInfoBean empinfoBean) {

		return dao.updateEmployeeinfo(empinfoBean);
	}
	
	@DeleteMapping("/deleteEmployee")
	public  boolean deleteEmployee(@RequestParam("id") int id) {

		return dao.deleteEmployeeinfo(id);
	}
	
	@GetMapping("/getEmployee")
	public  EmployeeInfoBean getEmployee(@RequestParam("id") int id) {

		return dao.getEmployeeInfo(id);
	}
	@GetMapping(value="/getAllEmployee",produces= {MediaType.APPLICATION_JSON_VALUE})
	public  List<EmployeeInfoBean> getAllEmployee() {

		return dao.getAllEmployeeInfo();
	}
	
	

	
}// end of class
