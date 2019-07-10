package com.covalense.hibernateapp.awsrds;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.covalense.hibernateapp.cache.EmployeeNewInfoBean;
/*
 * Hibernate-insert records to AWS DB
 */
public class HibernateProgramForAws {
	public static void main(String[] args) {

		EmployeeNewInfoBean bean = new EmployeeNewInfoBean();
		bean.setId(01);
		bean.setEmail("gigan@gamil.com");
		bean.setName("gigan");

		try (Session session = HibernateUtil.openSession();) {

			Transaction transaction = session.beginTransaction();
			session.save(bean);
			transaction.commit();

		}

	}// end of main

}// end of class
