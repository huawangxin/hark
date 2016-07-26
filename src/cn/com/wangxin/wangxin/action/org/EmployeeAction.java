package cn.com.wangxin.wangxin.action.org;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.wangxin.wangxin.org.entity.Employee;
import cn.com.wangxin.wangxin.org.service.EmployeeManage;

/**
 * 员工
 * 
 * @author huawangxin
 *
 * @date 2016年7月25日 下午3:08:21
 */
public class EmployeeAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7707080417684142322L;

	private Employee employee;

	@Resource  
	private EmployeeManage employeeManage;
	

	public void setEmployeeManage(EmployeeManage employeeManage) {
		this.employeeManage = employeeManage;
	}
	
	public EmployeeManage getEmployeeManage() {
		return employeeManage;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String addEmployee()
	{
		System.out.println("-------employeeAction.addEmployee--------"+employee.getName());
		
		employeeManage.addEmployee(employee);
		return "success";
	}
	
	public String modifyEmployee()
	{
		System.out.println("-------employeeAction.modifyEmployee--------"+employee.getName());
		employeeManage.modifyEmployee(employee);
		return "success";
	}
	
	public String deleteEmployee()
	{
		System.out.println("-------employeeAction.deleteEmployee--------"+employee.getName());
		employeeManage.deleteEmployee(employee);
		return "success";
	}
	
	
}
