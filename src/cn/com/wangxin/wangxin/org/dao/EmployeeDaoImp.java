package cn.com.wangxin.wangxin.org.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cn.com.wangxin.wangxin.org.entity.Employee;

public class EmployeeDaoImp implements EmployeeDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void AddEmployee(Employee employee) {
		System.out.println("-------EmployeeDaoImp.AddEmployee-----------"
				+ employee.getName());
		getSession().save(employee);
	}

	@Override
	public void modifyEmployee(Employee employee) {
		System.out.println("-------EmployeeDaoImp.modifyEmployee-----------"
				+ employee.getName());
		getSession().save(employee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		System.out.println("-------EmployeeDaoImp.deleteEmployee-----------"
				+ employee.getName());
		getSession().save(employee);
	}

}
