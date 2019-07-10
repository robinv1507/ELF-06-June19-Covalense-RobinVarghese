package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
/*
 * Hibernate-cache demo
 */
public class HibernateCacheTest {

	public static void main(String[] args) {

		// 1.load the config file
		Configuration configuration = new Configuration();
		configuration.configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml");
		configuration.addAnnotatedClass(EmployeeNewInfoBean.class);

		// 2.build the SessionFactory
		SessionFactory factory = configuration.buildSessionFactory();

		// 3.open Session
		Session session = factory.openSession();

		// 4. Interact wuth DB via Session
		EmployeeNewInfoBean bean1 = session.get(EmployeeNewInfoBean.class, 1);
		log.info("1st Time" + bean1.toString());

		EmployeeNewInfoBean bean2 = session.get(EmployeeNewInfoBean.class, 1);
		log.info("1st Time" + bean2.toString());

		EmployeeNewInfoBean bean3 = session.get(EmployeeNewInfoBean.class, 1);
		log.info("1st Time" + bean3.toString());
		// 5.close session
		session.close();

	}// end of main

}// end of class
