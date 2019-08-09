package com.covalense.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

import com.covalense.emp.beans.EmployeeAddressInfoBean;
import com.covalense.emp.beans.EmployeeEducationalInfoBean;
import com.covalense.emp.beans.EmployeeEducationalInfoPKBean;
import com.covalense.emp.beans.EmployeeExperienceInfoBean;
import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.beans.EmployeeOtherInfoBean;
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

	// authentication for login
	@PostMapping("/authenticate")
	public String authenticate(int id, String password, HttpServletRequest request,
			@Value("${loginErrMessage}") String loginErrMessage) {

		EmployeeInfoBean bean = dao.getEmployeeInfo(id);

		// login validation
		if (bean != null & id == bean.getId() && password.equals(bean.getPassword())) {

			HttpSession session = request.getSession(true);
			session.setAttribute("bean", bean);

			session.setAttribute("logMsg", "successfully logged in");

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

		return "employeeRegister";

	}

	// submitRegisterData
	@PostMapping("/submitRegisterData")
	public String submitRegisterData(EmployeeInfoBean empinfoBean, int managerId, ModelMap map) {
		// for EmployeeEducationalInfoBean
		List<EmployeeEducationalInfoBean> educationalInfoBeans = empinfoBean.getEducationalInfoBeans();
		for (EmployeeEducationalInfoBean empEdu : educationalInfoBeans) {
			EmployeeEducationalInfoPKBean empEdupkbean = empEdu.getEducationalInfoPKBean();
			empEdupkbean.setInfoBean(empinfoBean);

		}
		// for EmployeeAddressInfoBean
		List<EmployeeAddressInfoBean> eAddressInfoBeans = empinfoBean.getAddressInfoBean();
		for (EmployeeAddressInfoBean empAddress : eAddressInfoBeans) {
			empAddress.getAddPK().setInfoBean(empinfoBean);
		}
		// for EmployeeExperienceInfoBean
		List<EmployeeExperienceInfoBean> empExpInfoBeans = empinfoBean.getExpInfoBean();
		for (EmployeeExperienceInfoBean empExp : empExpInfoBeans) {
			empExp.getEmpPkBean().setInfoBean(empinfoBean);
		}

		EmployeeOtherInfoBean otherInfoBean = empinfoBean.getOtherInfo();
		otherInfoBean.setInfoBean(empinfoBean);

		if (dao.createEmployeeinfo(empinfoBean, managerId)) {
			map.addAttribute("errPswMsg", "Registration Finished Successfully");
			return EmpConstant.VIEW_LOGIN_PAGE;
		} else {
			map.addAttribute("errPswMsg", " Registration Failed ,Try again");
			return EmpConstant.VIEW_LOGIN_PAGE;
		} // end of else
	}// end submitRegisterData()

	/* ==============logout============ */
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap map, @Value("${logoutErrMessage}") String logoutErrMessage) {

		session.invalidate();
		map.addAttribute("logMsg", logoutErrMessage);
		return EmpConstant.VIEW_LOGIN_PAGE;// loginPage.jsp
	}

	// updateEmployee
	@GetMapping("/updateEmployee")
	public String getUpdateEmployee() {

		return "updateEmployee";
	}// end of getUpdateEmployee
	// updateEmployee
		@PostMapping("/updateEmployee")
		public String updateEmployee(EmployeeInfoBean empinfoBean, int managerId,ModelMap map){
			
			if (dao.createEmployeeinfo(empinfoBean, managerId)) {
				map.addAttribute("errPswMsg", "Employee details Updated Finished Successfully");
				return EmpConstant.VIEW_HOME_PAGE;
			} else {
				map.addAttribute("errPswMsg", " Employee details Updation Failed ,Try again");
				return EmpConstant.VIEW_HOME_PAGE;
			} // end of else
			

			
		}// end of getUpdateEmployee

}// end of class
