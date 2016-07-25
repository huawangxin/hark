package cn.com.wangxin.wangxin.org.dao;

import cn.com.wangxin.wangxin.org.entity.Employee;

public interface EmployeeDao {
	public void AddEmployee(Employee employee);
	public void modifyEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
}
