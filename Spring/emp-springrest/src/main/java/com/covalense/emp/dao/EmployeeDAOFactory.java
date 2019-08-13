package com.covalense.emp.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOFactory {

	@Bean("jdbc")
	public EmployeeDAO getInstanceJDBC() {

		return new EmployeeDAOJdbcImpl();
	}// end of getInstanceJDBC()

	@Bean("hibernate")
	public EmployeeDAO getInstanceHibernate() {

		return new EmployeeDAOHibernateImpl();
	}// end of getInstanceHibernate()

}// end of class
