package com.covalense.hibernateapp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;
import lombok.extern.java.Log;
@Log
/*
 * Reading the records from table using Hibernate
 */
public class ReadRecord {

	public static void main(String[] args) {
		
        //1.load the config file
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(EmployeeInfoBean.class);
		configuration.addAnnotatedClass(EmployeeOtherInfoBean.class);
		
		//configuration.configure("MyhibernateConfig.xml");
		
		//configuration.configure(new File("D:\\MyhibernateConfig.xml"));
		    
		//2.build the SessionFactory
		SessionFactory factory = configuration.buildSessionFactory();
		
		//3.open the Session
		Session session = factory.openSession();
		
		// 4.interact with db via Session
		EmployeeInfoBean emp = session.get(EmployeeInfoBean.class, 1);

		log.info("Name " + emp.getName());
		log.info("Phone Number :" + emp.getPhone());

		log.info("Email :" + emp.getEmail());

		// Reading another table data

		EmployeeOtherInfoBean empOtherInfo = session.get(EmployeeOtherInfoBean.class, 1);

		log.info(" is challenged " + empOtherInfo.isChallenged());
		
        //5.close Session
		session.close();

	}// end of main

}// end of class
