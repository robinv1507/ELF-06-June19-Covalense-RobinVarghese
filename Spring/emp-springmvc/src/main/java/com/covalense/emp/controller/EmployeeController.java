package com.covalense.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
/*
 * spring mvc: Dispatcher servlet demo
 */
public class EmployeeController {
	@RequestMapping(path = "/getMessage", method = RequestMethod.GET)
	public ModelAndView getMessage() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("messagePage");

		return modelAndView;
	}
	@GetMapping("/seeMessage")
	public ModelAndView seeMessage() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("messagePage");

		return modelAndView;
	}

}
