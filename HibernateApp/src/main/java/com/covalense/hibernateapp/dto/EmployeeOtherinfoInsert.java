package com.covalense.hibernateapp.dto;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeOtherinfoInsert {

	public static void main(String[] args) {


		
		Configuration cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		
		
	     SessionFactory sessionFactory=cfg.buildSessionFactory();
	     
	     Session session=sessionFactory.openSession();
	     
		
	     EmployeeOtherInfoBean employeeOtherInfo=new EmployeeOtherInfoBean();
	     
	     employeeOtherInfo.setId(2);
	    
	     employeeOtherInfo.setAdhar(588856899);
	     
	     employeeOtherInfo.setBloodGrp("o+");
	     employeeOtherInfo.setChallenged(false);
	     employeeOtherInfo.setEmergencyContactNumber(759646999);
	     employeeOtherInfo.setIsmarried(false);
	     employeeOtherInfo.setEmergencyContactName("amal");
	     employeeOtherInfo.setFatherName("varghese");
	     
	     employeeOtherInfo.setMotherName("elsy");
	     employeeOtherInfo.setNationality("Indian");
	     employeeOtherInfo.setPan("BHE9455");
  
	     employeeOtherInfo.setPassport(125545);
	     employeeOtherInfo.setReligion("hindu");
	     employeeOtherInfo.setSpouseName(" ");
	     
	    
	     
	     
	     Transaction transaction=session.beginTransaction();
	     
	     session.save(employeeOtherInfo);
	     transaction.commit();
	     session.close();
		
	}//end of main

}//end of class

		
		
		
	