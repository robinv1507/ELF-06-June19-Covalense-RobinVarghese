package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
/*
 * HibernateQueryLanguage(HQL) query operations demo
 */
public class InsertRecord {

	public static void main(String[] args) {

		Session session = HibernateUtil.openSession();

		String hql = "insert into EmployeeNewInfoBean (id,name,email)"
				+ " select id,name,email from EmployeeInfoBean where id=1";

		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery(hql);
			int result = query.executeUpdate();
			log.info(result + "rows affected");
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
