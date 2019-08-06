package com.covalense.hibernateapp.manytoone;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;
import com.covalense.hibernateapp.onetoone.EmployeeOtherInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

public class HibernateManyToOneImpl {

	public void createEmployee(EmployeeInfoBean infoBean, EmployeeOtherInfoBean otherInfoBean,
			List<EmployeeEducationalInfoBean> educationalInfoBeans, List<EmployeeAddressInfoBean> addressInfo,
			List<EmployeeExperienceInfoBean> empExp) {

		Session session = HibernateUtil.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(infoBean);
		session.save(otherInfoBean);
		for (EmployeeAddressInfoBean employeeAddressInfo : addressInfo) {
			session.save(employeeAddressInfo);
		}
		for (EmployeeEducationalInfoBean bean : educationalInfoBeans) {
			session.save(bean);
		}
		for (EmployeeExperienceInfoBean bean : empExp) {
			session.save(bean);
		}

		transaction.commit();

		session.close();
	}// end of createEmployee()

}// class end
