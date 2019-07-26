package com.covalense.hibernateappwithspring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.hibernateappwithspring.beans.EmployeeInfoBean;
import com.covalense.hibernateappwithspring.config.HibernateConfig;

import lombok.extern.java.Log;

@Log
/*
 * Spring :Reading the records from table
 */
public class ReadRecord {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

		SessionFactory factory = context.getBean(SessionFactory.class);
		// open the Session
		try (Session session = factory.openSession();) {

			// 4.interact with db via Session
			EmployeeInfoBean emp = session.get(EmployeeInfoBean.class, 1);
			// displaying records
			log.info("" + emp.toString());

		}

	}// end of main

}// end of class
