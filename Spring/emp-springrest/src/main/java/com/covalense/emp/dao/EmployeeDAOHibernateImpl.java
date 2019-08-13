package com.covalense.emp.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.emp.beans.EmployeeAddressInfoBean;
import com.covalense.emp.beans.EmployeeDepartmentInfoBean;
import com.covalense.emp.beans.EmployeeEducationalInfoBean;
import com.covalense.emp.beans.EmployeeEducationalInfoPKBean;
import com.covalense.emp.beans.EmployeeExperienceInfoBean;
import com.covalense.emp.beans.EmployeeInfoBean;
import com.covalense.emp.beans.EmployeeOtherInfoBean;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	@Autowired
	private  SessionFactory sessionFactory;
	
		
	
	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session = sessionFactory.openSession();
		String hql = "from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		return query.list();
	}
	//search employee like %
	@Override
	public List<EmployeeInfoBean> getSearchEmployeeInfo(int id) {
		EmployeeInfoBean bean =null;
		Session session = sessionFactory.openSession();
		String hql = "from EmployeeInfoBean where id like '"+id+"%'";
		Query query = session.createQuery(hql);
		
		return query.list();
	}
	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		
		Session session=sessionFactory.openSession();
			
		EmployeeInfoBean bean= session.get(EmployeeInfoBean.class, id);
	    
		return bean;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {

		return getEmployeeInfo(Integer.parseInt(id));
	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;

		try (Session session = sessionFactory.openSession();){
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			if(txn!=null) {
				txn.rollback();
			}
			
			return false;
		}
	}


	/*@Override
	public boolean updateEmployeeinfo(EmployeeInfoBean bean) {

		return saveOrUpdate(bean);
	}*/

	@Override
	public boolean deleteEmployeeinfo(int id) {
		Transaction txn = null;
		EmployeeInfoBean bean =new EmployeeInfoBean();
		bean.setId(id);

		try {
			Session session = sessionFactory.openSession();
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		}  catch (Exception e) {
			
			e.printStackTrace();
			if(txn!=null) {
				txn.rollback();
			}
			
			return false;
		}

	}

	@Override
	public boolean deleteEmployeeinfo(String id) {

		return deleteEmployeeinfo(Integer.parseInt(id));
	}

	@Override
	public boolean updateEmployeeinfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean createEmployeeinfo(EmployeeInfoBean empinfoBean) {
		
		// for EmployeeEducationalInfoBean
				List<EmployeeEducationalInfoBean> educationalInfoBeans = empinfoBean.getEducationalInfoBeans();
				for (EmployeeEducationalInfoBean empEdu : educationalInfoBeans) {
					EmployeeEducationalInfoPKBean empEdupkbean = empEdu.getEducationalInfoPKBean();
					empEdupkbean.setInfoBean(empinfoBean);

				}
				// for EmployeeAddressInfoBean
				List<EmployeeAddressInfoBean> eAddressInfoBeans = empinfoBean.getAddressInfoBean();
				for (EmployeeAddressInfoBean empAddress : eAddressInfoBeans) {
					empAddress.getAddPK().setInfoBean(empinfoBean);
				}
				// for EmployeeExperienceInfoBean
				List<EmployeeExperienceInfoBean> empExpInfoBeans = empinfoBean.getExpInfoBean();
				for (EmployeeExperienceInfoBean empExp : empExpInfoBeans) {
					empExp.getEmpPkBean().setInfoBean(empinfoBean);
				}

				EmployeeOtherInfoBean otherInfoBean = empinfoBean.getOtherInfo();
				otherInfoBean.setInfoBean(empinfoBean);

		
		return saveOrUpdate(empinfoBean);
	}
	public  EmployeeInfoBean getEmployeeInfoBean(int id) {
		EmployeeInfoBean bean =null;
		
		try(Session session=sessionFactory.openSession();) {
			
		    bean = session.get(EmployeeInfoBean.class, id);
	    }
		return bean;
	}

}
