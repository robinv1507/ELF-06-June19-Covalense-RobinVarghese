package com.covalense.hibernateapp.awsrds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.cache.EmployeeNewInfoBean;
import com.covalense.hibernateapp.dto.EmployeeInfoBean;

public class HibernateUtil {

	private static SessionFactory sessionFactory ;
	private HibernateUtil() {}

	private static SessionFactory buildSessionFactory() {
		// create the session factory from hibernate.cfg.xml

		return new Configuration()
				.configure("com/covalense/hibernateapp/awsrds/hibernate.aws.cfg.xml")
				.addAnnotatedClass(EmployeeNewInfoBean.class)
				.buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}

		return sessionFactory;
	}// end of getSessionFactory()
	public static Session openSession() {
		return getSessionFactory(). openSession();
		
	}
}// end of class
