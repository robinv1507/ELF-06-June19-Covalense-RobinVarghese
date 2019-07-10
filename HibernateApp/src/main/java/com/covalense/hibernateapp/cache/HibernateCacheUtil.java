package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCacheUtil {
	
	private static SessionFactory sessionFactory;
	
	private HibernateCacheUtil() {}
	//building the sessionFactory
	private  static SessionFactory  buildSessionFactory() {
		if(sessionFactory==null) {
			sessionFactory =new Configuration()
				.configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml")
				.addAnnotatedClass(EmployeeNewInfoBean.class)
				.buildSessionFactory();
		}
		return sessionFactory;
		
	}//end of   buildSession() 
	
	
	public static Session openSession() {
		
		return buildSessionFactory().openSession();
	}//end of  openSession() 

}//end of class
