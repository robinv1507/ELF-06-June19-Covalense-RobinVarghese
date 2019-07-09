package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;
@Log
public class HibernateCacheTest2 {

	public static void main(String[] args) {
	
		log.info("1st Time"+getEmpployeeData(1).toString());
		log.info("2st Time"+getEmpployeeData(1).toString());
		log.info("3st Time"+getEmpployeeData(1).toString());
	}// end of main
	
	public static EmployeeNewInfoBean getEmpployeeData(int id) {
		//1.load the config file
		Configuration configuration=new Configuration();
		configuration.configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml");
		configuration.addAnnotatedClass(EmployeeNewInfoBean.class);
		
		
		//2.build the SessionFactory
		SessionFactory factory=configuration.buildSessionFactory();
		
		
		//3.open Session
		Session session=factory.openSession();
		
		//4. Interact wuth DB via Session
		EmployeeNewInfoBean bean=session.get(EmployeeNewInfoBean.class, 1);
		
		//5.close session
		session.close();

		return bean;
		
		
	}//

}// end of class
