package com.covalense.hibernateapp.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static  SessionFactory sessionFactory=null;
	
	private static SessionFactory buildSessionFactory()
	{
		//create the session factory from hibernate.cfg.xml
		 Configuration  cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
	
		  return  cfg.buildSessionFactory();
		     
	}
	
	public static SessionFactory getSessionFactory() {
			if(sessionFactory==null){
				sessionFactory=buildSessionFactory();
			}
			
		
		return sessionFactory;
	}//end of getSessionFactory()
}//end of class
