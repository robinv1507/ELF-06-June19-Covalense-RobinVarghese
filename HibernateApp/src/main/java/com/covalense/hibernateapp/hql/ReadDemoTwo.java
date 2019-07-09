package com.covalense.hibernateapp.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
/*
 * HibernateQueryLanguage(HQL) query operations demo
 */
public class ReadDemoTwo {

	public static void main(String[] args) {

		Session session = HibernateUtil.openSession();

		String hql = "select name  from EmployeeInfoBean where id=1";
		Query query = session.createQuery(hql);
		List<String> ename = query.list();

		for (String empname : ename) {

			log.info("name =>" + empname);

		}

	}// end of main

}// end of class
