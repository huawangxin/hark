package cn.com.wangxin.wangxin.org.dao;

import java.util.List;

import cn.com.wangxin.wangxin.org.entity.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee employee);
	public void modifyEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public List<Employee> queryEmployees();
	/**
	 * 根据 登录名loginName 查 员工信息
	 * @param loginName
	 * @return
	 */
	public Employee queryEmployee(String loginName);
}
