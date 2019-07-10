package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log

public class DeleteRecord {
	public static void main(String[] args) {

		Session session = HibernateUtil.openSession();
		String hql = "Delete from EmployeeInfoBean where id=:eid";
		
		Query query = session.createQuery(hql);
		query.setParameter("eid", 13);
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			int result = query.executeUpdate();
			log.info(result + "rows deleted");
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
