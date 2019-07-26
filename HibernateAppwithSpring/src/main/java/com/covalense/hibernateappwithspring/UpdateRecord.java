package com.covalense.hibernateappwithspring;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.hibernateappwithspring.beans.EmployeeInfoBean;
import com.covalense.hibernateappwithspring.config.HibernateConfig;

/*
 * Spring-Hibernate: update records
 */
public class UpdateRecord {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

		SessionFactory factory = context.getBean(SessionFactory.class);
		// open the Session
		try (Session session = factory.openSession();) {

			EmployeeInfoBean emp = session.get(EmployeeInfoBean.class, 2);
			// setting new data
			emp.setAge(23);

			Transaction transaction = session.beginTransaction();
			// updating
			session.update(emp);
			transaction.commit();
			session.close();

		}
	}// end of main

}// end of class
