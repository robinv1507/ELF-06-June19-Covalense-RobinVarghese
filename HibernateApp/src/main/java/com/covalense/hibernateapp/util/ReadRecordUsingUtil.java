package com.covalense.hibernateapp.util;

import org.hibernate.Session;
import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import lombok.extern.java.Log;
@Log
/*
 * Hibernate
 * Reading the records from table using util class 
 */
public class ReadRecordUsingUtil {

	public static void main(String[] args) {

		//SessionFactory factory=HibernateUtil.getSessionFactory();
		
		Session session=HibernateUtil.openSession();
		//fechting the specified row data
		EmployeeInfoBean emp=session.get(EmployeeInfoBean.class,1);
		
		log.info("Name "+emp.getName());
		log.info("Phone Number :"+emp.getPhone());
		
		log.info("Email :"+emp.getEmail());
	
		session.close();
		
		
	}//end of main 

}//end of class
