package com.covalense.hibernateassessment.sessionfactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/*
 * Question 4.
 *  Write a Session Factory singleton class to get session object.
 */
public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private HibernateUtil() {
	}

	private static SessionFactory buildSessionFactory() {

		return new Configuration().configure().buildSessionFactory();

	}// end of buildSessionFactory()

	private static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}

	public static Session openSession() {

		return getSessionFactory().openSession();
	}

}
