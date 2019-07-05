package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log
/*
 * hibernate
 * Delete table record 
 * 
 */
public class DeleteRecord {

	public static void main(String[] args) {

		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		
		Session session=factory.openSession();
		//fechting the specified row data
		
		EmployeeInfoBean emp=session.get(EmployeeInfoBean.class,11);
		
		
		
		Transaction transaction= session.beginTransaction();
		
		session.delete(emp);
		transaction.commit();
	
		
		session.close();
		
		
	}//end of main 

}//end of class