package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.covalense.emp.dto.UserBean;

@Controller
@RequestMapping("/form")// my entire project Dispatcher controller
/*
 * spring mvc: Dispatcher servlet demo
 */
public class MyFormController {
	// controller1
	@GetMapping("/getForm")
	public String getForm() {

		return "myform";
	}

	/* ===========controller2=========== */
	/*
	 * formSubmit(controller) :onone way of getting the form data and return to
	 * formDataDisplay.jsp
	 */
	@PostMapping("/formSubmit")
	public String submitForm(HttpServletRequest req) {
		int userId = Integer.parseInt(req.getParameter("empid"));
		String pwd = req.getParameter("password");

		req.setAttribute("userId", userId);
		req.setAttribute("pwd", pwd);
		return "formDataDisplay";// formDataDisplay==formDataDisplay.jsp
	}

	/* ===========controller3=========== */
	// another way of getting the form data and return to formDataDisplay.jsp
	@PostMapping("/formSubmit2")
	public String submitForm2(int userId, String pwd, ModelMap map) {

		map.addAttribute("userId", userId);
		map.addAttribute("pwd", pwd);
		// formDataDisplay==formDataDisplay.jsp
		return "formDataDisplay";
	}

	/* ===========controller4=========== */
	// using bean class:-another way of getting the form data and return to
	// formDataDisplay.jsp
	@PostMapping("/formSubmit3")
	public String submitForm3(UserBean bean, ModelMap map) {

		map.addAttribute("bean", bean);
		// formDataDisplayUsingBean==formDataDisplayUsingBean.jsp
		return "formDataDisplayUsingBean";
	}

	/* ===========controller5=========== */
	// another way of getting the form data and return to formDataDisplay.jsp
	@PostMapping("/formSubmit4")
	public String submitForm4(@RequestParam(name = "userId") int uid,
			@RequestParam(name = "password") String pwd,ModelMap modelMap) {
		
		modelMap.addAttribute("userId", uid);
		modelMap.addAttribute("password", pwd);

		// formDataDisplay==formDataDisplay.jsp
		return "formDataDisplay";
	}
	/* ===========controller6=========== */
	// another way of getting the form data and return to formDataDisplayUsingExpressionLanguage.jsp
	@PostMapping("/formSubmit5")
	public String submitForm5(@RequestParam(name = "userId") int uid,
			@RequestParam(name = "password") String pwd,ModelMap modelMap) {
		
		modelMap.addAttribute("userId", uid);
		modelMap.addAttribute("password", pwd);

		//formDataDisplayUsingExpressionLanguage==formDataDisplayUsingExpressionLanguage.jsp
		return "formDataDisplayUsingExpressionLanguage";
	}
	/* ===========controller4=========== */
	// using bean class:-another way of getting the form data and return to
	// formDataDisplayUsingBeanExLang.jsp
	@PostMapping("/formSubmit6")
	public String submitForm6(UserBean bean, ModelMap map) {

		map.addAttribute("bean", bean);
		// formDataDisplayUsingBeanExLang==formDataDisplayUsingBeanExLang.jsp
		return "formDataDisplayUsingBeanExLang";
	}

	
}
