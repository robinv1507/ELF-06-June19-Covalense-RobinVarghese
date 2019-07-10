package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log

public class UpdateRecord {
	public static void main(String[] args) {

		Session session = HibernateUtil.openSession();
		String hql = "update EmployeeInfoBean set name='vikas' where id=8";
		Query query = session.createQuery(hql);
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			int result = query.executeUpdate();
			log.info(result + "rows updated");
			transaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
			transaction.rollback();
		}

		finally {
			// closing session
			session.close();
		}

	}// end of main

}// end of class
