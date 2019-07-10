package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;

public class UpdateRecord {

	public static void main(String[] args) {

		
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		
		Session session=factory.openSession();
		//fechting the specified row data
		EmployeeInfoBean emp=session.get(EmployeeInfoBean.class,1);
		//setting new data
		emp.setAge(29);
		
		
		Transaction transaction=session.beginTransaction();
		//updating
		session.update(emp);
		transaction.commit();
		session.close();
		
		//updating another table data
		session=factory.openSession();
		
		EmployeeOtherInfoBean empOtherInfo=session.get(EmployeeOtherInfoBean.class, 01);
		
		empOtherInfo.setBloodGrp("O-");
		transaction=session.beginTransaction();
		session.update(empOtherInfo);
		transaction.commit();
		session.close();

		
	}//end of main 

}//end of class
