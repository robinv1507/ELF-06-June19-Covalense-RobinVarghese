package com.covalense.hibernateapp;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;

public class SaveDemoMain {

	public static void main(String[] args) {

		
		
		Configuration cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		//cfg.addAnnotatedClass(EmployeeInfoBean.class);
		
	     SessionFactory sessionFactory=cfg.buildSessionFactory();
	     
	     Session session=sessionFactory.openSession();
	     
		
	     EmployeeInfoBean employeeInfo=new EmployeeInfoBean();
	     employeeInfo.setId(12);
	    
	     employeeInfo.setName("ramjith");
	     employeeInfo.setAge(26);
	     employeeInfo.setGender("male");
	     employeeInfo.setSalary(2300000);
	     employeeInfo.setPhone(989798989);
	     employeeInfo.setJoiningDate(new Date("2016/02/02"));
	     employeeInfo.setAcntNo(12012422);
	     employeeInfo.setEmail("ramjith323@gmail.com");
	     employeeInfo.setDesignation("tester");
	     employeeInfo.setDob(new Date("1991/02/03"));
  
	     employeeInfo.setDeptId(10);
	     employeeInfo.setManagerId(120);
	    
	     
	     
	     Transaction transaction=session.beginTransaction();
	     
	    // session.save(employeeInfo);
	     session.saveOrUpdate(employeeInfo);
	     transaction.commit();
	     session.close();
		
	}//end of main

}//end of class
