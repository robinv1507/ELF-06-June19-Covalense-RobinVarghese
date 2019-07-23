package com.covalense.hibernateappwithspring;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.hibernateappwithspring.beans.EmployeeInfoBean;
import com.covalense.hibernateappwithspring.config.HibernateConfig;
/*
 * 
 */
public class SaveDemoMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

		SessionFactory factory = context.getBean(SessionFactory.class);
		// setting the value to bean
		EmployeeInfoBean employeeInfo = new EmployeeInfoBean();
		employeeInfo.setId(22);
		/* =========setting the data to bean========== */
		employeeInfo.setName("Krish");
		employeeInfo.setAge(26);
		employeeInfo.setGender("male");
		employeeInfo.setSalary(2300000);
		employeeInfo.setPhone(989798989l);
		employeeInfo.setJoiningDate(new Date("2016/02/02"));
		employeeInfo.setAcntNo(12012422l);
		employeeInfo.setEmail("krish@gmail.com");
		employeeInfo.setDesignation("tester");
		employeeInfo.setDob(new Date("1991/02/03"));
		employeeInfo.setPassword("1234");
		employeeInfo.setDeptId(10);
		employeeInfo.setManagerId(120);
		/* ============inserting to DB===================*/
		Transaction transaction = null;
		try (Session session = factory.openSession();) {

			transaction = session.beginTransaction();
			session.saveOrUpdate(employeeInfo);

			transaction.commit();
		}

	}// end of main

}// end of class
