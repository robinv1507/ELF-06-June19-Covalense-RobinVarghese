package com.covalense.springcore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.covalense.springcore.beans.EmployeeBeanTwo;

/*
 * Spring core -Auto wire using annotation
 */
@Configuration
@Import(DeptConfig.class)
public class EmployeeConfig {
	@Bean
	public EmployeeBeanTwo getEmployeeBean() {

		EmployeeBeanTwo empBean = new EmployeeBeanTwo();
		empBean.setId(01);
		empBean.setName("robin");
		return empBean;
	}

}
