package cn.com.wangxin.wangxin.org.service;

import cn.com.wangxin.wangxin.org.entity.Employee;

public interface EmployeeManage {
	public void addEmployee(Employee employee);
	public void modifyEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
}
