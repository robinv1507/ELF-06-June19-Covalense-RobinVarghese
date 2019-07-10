package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
/*
 *Hibernate- update record using setparameter()
 */
public class DynamicUpdateRecord {
	public static void main(String[] args) {

		Session session = HibernateUtil.openSession();
		String hql = "update EmployeeInfoBean set name=:nm where id=:eid";
		//String hql = "update from EmployeeInfoBean set name='"+args[0]+"' where id="+Integer.parseInt(args[1])+"";
		Query query = session.createQuery(hql);
		query.setParameter("eid",args[0]);
		query.setParameter("nm", args[1]);
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
