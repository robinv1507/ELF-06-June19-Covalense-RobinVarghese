package com.covalense.hibernateassessment.student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.covalense.hibernateassessment.dto.StudentBean;
import com.covalense.hibernateassessment.sessionfactory.HibernateUtil;

import lombok.extern.java.Log;

/*    
*Question 5.
*write a logic to display firstName and totalMarks for all student.
*
 */
@Log
public class StudentTableReadRecord {
	public static void main(String[] args) {

		try (Session session = HibernateUtil.openSession()) {

			String hql = "select firstName,totalMarks from StudentBean)";
			Query query = session.createQuery(hql);
			// getting firstName and totalMarks for all student.
			List<StudentBean> list = query.getResultList();
			// printing
			for (StudentBean bean : list) {
				log.info("name" + bean.getFirstName());
				log.info("name" + bean.getTotalMarks());
			}

		}

	}// end of main

}// end of class
