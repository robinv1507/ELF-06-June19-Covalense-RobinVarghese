package com.covalense.designpatterns.dao;

public class EmployeeDAOFactory {
	private static String dbInteractionType = "hibernate";
	
	private EmployeeDAOFactory() {}

	public static EmployeeDAO getInstance() {

		EmployeeDAO dao = null;

		if (dbInteractionType.equals("jdbc")) {
			dao = new EmployeeDAOJdbcImpl();
		} else if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl2();
		}

		return dao;
	}// end of getInstance()

}// end of class
