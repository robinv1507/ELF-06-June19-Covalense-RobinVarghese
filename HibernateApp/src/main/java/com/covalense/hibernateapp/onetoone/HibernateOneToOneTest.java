package com.covalense.hibernateapp.onetoone;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernateapp.util.HibernateUtil;
import com.covalense.hibernateapp.util.PreparedDataUtil;

import lombok.extern.java.Log;

@Log

public class HibernateOneToOneTest {

	public static void main(String[] args) {

		//// prepare data
		int id = 15;
	
		EmployeeInfoBean data = PreparedDataUtil.PrepareData(id);
           save(data);

	}// end of main
	private static void save(EmployeeInfoBean data) {
		Transaction txn = null;
		try (Session session = HibernateUtil.openSession()) {

			txn = session.beginTransaction();
			session.save(data);
			txn.commit();

		} catch (Exception ex) {
			log.severe(Arrays.toString(ex.getStackTrace()));

			if (txn != null) {
				txn.rollback();
			}
		} // end of try catch
	}

}// end of class
