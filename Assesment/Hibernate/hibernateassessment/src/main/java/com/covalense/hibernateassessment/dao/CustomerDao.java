package com.covalense.hibernateassessment.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernateassessment.dto.CustomerBean;
import com.covalense.hibernateassessment.sessionfactory.HibernateUtil;

public class CustomerDao {

	public boolean insertRecord(CustomerBean customerBean) {

		try (Session session = HibernateUtil.openSession()) {

			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(customerBean);
			transaction.commit();
		}
		return true;
	}// end of insertRecord()

	public CustomerBean readRecord(int id) {

		try (Session session = HibernateUtil.openSession()) {

			return session.get(CustomerBean.class, id);
		}

	}// end of readRecord()
	public boolean deleteRecord(int id) {

		try (Session session = HibernateUtil.openSession()) {
			CustomerBean customerBean =session.get(CustomerBean.class, id);

			Transaction transaction = session.beginTransaction();
			session.delete(customerBean);
			transaction.commit();
		}
		return true;
	}// end of insertRecord()

}
