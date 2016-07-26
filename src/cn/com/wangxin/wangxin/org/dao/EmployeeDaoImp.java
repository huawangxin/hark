package cn.com.wangxin.wangxin.org.dao;

import java.util.List;

import org.hibernate.Query;
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
	public void addEmployee(Employee employee) {
		getSession().save(employee);
	}

	@Override
	public void modifyEmployee(Employee employee) {
		getSession().update(employee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		getSession().delete(employee);
	}
	@Override
	public List<Employee> queryEmployees() {
		System.out.println("查询所有 员工信息");
		Query query=getSession().createQuery("select * from hark_huawangxin_employee order by companyOrgUid ");
		List<Employee> employees=query.list();
		return employees;
	}
	/**
	 * 表名为实体类的 类名 
	 */
	@Override
	public Employee queryEmployee(String loginName) {
//		String sql="select * from hark_huawangxin_employee where  loginName = '"+loginName+"'";
//		Query query=getSession().createSQLQuery(sql);
		Query query=getSession().createQuery(" from Employee e where e.loginName =:loginName ");
		query.setString("loginName", loginName);
		List<Employee> employees=query.list();
		return employees.get(0);
	}

}
