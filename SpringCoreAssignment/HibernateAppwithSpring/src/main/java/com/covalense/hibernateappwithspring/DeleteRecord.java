package com.covalense.hibernateappwithspring;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.hibernateappwithspring.beans.EmployeeInfoBean;
import com.covalense.hibernateappwithspring.config.HibernateConfig;

/*
 * Spring : hibernate Delete table record
 * 
 */
public class DeleteRecord {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

		SessionFactory factory = context.getBean(SessionFactory.class);
		// open the Session
		try (Session session = factory.openSession();) {

			EmployeeInfoBean emp = session.get(EmployeeInfoBean.class, 1);

			Transaction transaction = session.beginTransaction();

			session.delete(emp);
			transaction.commit();
		}

	}// end of main

}// end of class