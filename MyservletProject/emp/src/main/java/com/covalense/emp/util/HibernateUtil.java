package com.covalense.emp.util;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private HibernateUtil() {
	}

	private static SessionFactory buildSessionFactory() {
		// create the session factory from hibernate.cfg.xml

		return new Configuration().configure().buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}

		return sessionFactory;
	}// end of getSessionFactory()

	public static Session openSession() {
		return getSessionFactory().openSession();

	}
}// end of class
