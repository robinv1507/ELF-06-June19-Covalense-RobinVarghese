package com.covalense.hibernateapp.manytomany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

public class HibernateImpl {

	public void createTrainingInfo(TrainingInfoBean infoBean) {

		Session session = HibernateUtil.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(infoBean);

		transaction.commit();

		session.close();
	}// end of createEmployee()
	public void createEmployeeInfo(EmployeeInfoBean infoBean) {

		Session session = HibernateUtil.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(infoBean);

		transaction.commit();

		session.close();
	}// end of createEmployee()
	
	public EmployeeInfoBean getEmployeeinfo(int id) {

		Session session = HibernateUtil.openSession();

		EmployeeInfoBean infoBean=session.get(EmployeeInfoBean.class, id);
		session.close();
		return infoBean;
	}// end of getEmployeeinfo()

}// class end
