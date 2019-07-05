package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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

		
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		
		Session session=factory.openSession();
		//fechting the specified row data
		EmployeeInfoBean emp=session.get(EmployeeInfoBean.class,1);
		
		log.info("Name "+emp.getName());
		log.info("Phone Number :"+emp.getPhone());
		
		log.info("Email :"+emp.getEmail());
	
		//  Reading another table data
		
		EmployeeOtherInfoBean empOtherInfo=session.get(EmployeeOtherInfoBean.class,1);
		
		log.info(" is challenged "+empOtherInfo.isChallenged());
		
		session.close();
		
		
	}//end of main 

}//end of class
