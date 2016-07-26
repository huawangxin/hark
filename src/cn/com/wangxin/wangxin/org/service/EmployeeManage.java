package cn.com.wangxin.wangxin.org.service;

import java.util.List;

import cn.com.wangxin.wangxin.org.entity.Employee;

public interface EmployeeManage {
	public void addEmployee(Employee employee);
	public void modifyEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public List<Employee> queryEmployee();
	/**
	 * 根据登录名 loginName 查询员工信息
	 * @param loginName
	 * @return
	 */
	public Employee queryEmployee(String loginName);
	
}
