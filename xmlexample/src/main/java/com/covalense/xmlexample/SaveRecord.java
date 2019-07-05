package com.covalense.xmlexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.xmlexample.dto.DepartmentInfoBean;
/*
 * 
 * hibernate mapping demo
 */
public class SaveRecord {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Session session = sessionFactory.openSession();

		DepartmentInfoBean dbean = new DepartmentInfoBean();
		dbean.setDeptId(50);
		dbean.setDeptName("Acounts");

		Transaction transaction = session.beginTransaction();

		// session.save(dbean);
		session.saveOrUpdate(dbean);
		transaction.commit();
		session.close();

	}//end of main

}//end of class
