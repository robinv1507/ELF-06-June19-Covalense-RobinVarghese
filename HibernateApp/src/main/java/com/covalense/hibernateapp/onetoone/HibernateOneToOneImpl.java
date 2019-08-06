package com.covalense.hibernateapp.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernateapp.util.HibernateUtil;

public class HibernateOneToOneImpl {
	
	public void createEmployee(EmployeeInfoBean infoBean,EmployeeOtherInfoBean otherInfoBean) {
		
		
		Session session=HibernateUtil.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		session.save(infoBean);
		session.save(otherInfoBean);
		
		transaction.commit();
		
		session.close();
	}//end of createEmployee()

}//class end
