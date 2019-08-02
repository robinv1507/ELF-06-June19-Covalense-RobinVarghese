package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.common.EmpConstant;
@PropertySource(EmpConstant.PROP_FILENAME)
@Controller
@RequestMapping("/validator")
public class SessionValidator {
	/* =============sessionValidate================== */
	@GetMapping("/validate/{url1}/{url2}")
	public String sessionValidate(HttpSession session, ModelMap map, @PathVariable("url1") String url1,
			                  @PathVariable("url2") String url2,
			                  @Value("${invalidSession}") String invalidSession) {
		if (session.isNew()) {
			map.addAttribute("logMsg", invalidSession);
			return EmpConstant.VIEW_LOGIN_PAGE;
		}
		return "forward:/"+url1+"/"+url2;
	}

	@PostMapping("/validate")
	public String sessionValidateForPost(HttpSession session, ModelMap map,
			            @PathVariable("url1") String url1,
                        @PathVariable("url2") String url2,
                        @Value("${invalidSession}") String invalidSession) {
		
		return sessionValidate(session,map,url1,url2,invalidSession);
	}/* ===========end of sessionValidate ====================== */


}
