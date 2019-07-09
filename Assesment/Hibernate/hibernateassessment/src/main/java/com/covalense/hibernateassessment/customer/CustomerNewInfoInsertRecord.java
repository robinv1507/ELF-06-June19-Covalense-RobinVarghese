package com.covalense.hibernateassessment.customer;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateassessment.dao.CustomerDao;
import com.covalense.hibernateassessment.dto.CustomerBean;
import com.covalense.hibernateassessment.sessionfactory.HibernateUtil;

import lombok.extern.java.Log;

/*
 *     
*Question 3.
* Insert a data from existing table(Customer) to new table using HQL.
*
 */
@Log
public class CustomerNewInfoInsertRecord {

	public static void main(String[] args) {

		CustomerDao dao = new CustomerDao();

		try (Session session = HibernateUtil.openSession()) {

			String hql = "insert into CustomerNewInfoBean(id,fname,lname,city) "
					+ " values(select id,fname,lname,city from CustomerBean)";
			Query query = session.createQuery(hql);

			Transaction transaction = session.beginTransaction();
			query.executeUpdate();

			transaction.commit();
		}

	}// end of main

}// end of class
