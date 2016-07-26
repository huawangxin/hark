package cn.com.wangxin.wangxin.org.service;

import java.util.List;

import javax.annotation.Resource;

import cn.com.wangxin.wangxin.org.dao.EmployeeDao;
import cn.com.wangxin.wangxin.org.entity.Employee;

public class EmployeeManageImp implements EmployeeManage {

	@Resource  
	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void addEmployee(Employee employee) {
		System.out.println("------EmployeeManageImp.adddEmployee--------"+employee.getName());
		employeeDao.addEmployee(employee);
		
	}

	@Override
	public void modifyEmployee(Employee employee) {
		System.out.println("------EmployeeManageImp.modifyEmployee--------"+employee.getName());
		employeeDao.modifyEmployee(employee);

	}

	@Override
	public void deleteEmployee(Employee employee) {
		System.out.println("------EmployeeManageImp.deleteEmployee--------"+employee.getName());
		employeeDao.deleteEmployee(employee);
	}

	@Override
	public List<Employee> queryEmployee() {
		System.out.println("------EmployeeManageImp.queryEmployee--------");
		List<Employee> employees=employeeDao.queryEmployees();
		return employees;
	}

	@Override
	public Employee queryEmployee(String loginName) {
		Employee employee=employeeDao.queryEmployee(loginName);
		return employee;
	}

}
