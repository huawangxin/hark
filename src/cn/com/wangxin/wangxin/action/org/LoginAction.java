package cn.com.wangxin.wangxin.action.org;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.com.wangxin.wangxin.org.entity.Employee;
import cn.com.wangxin.wangxin.org.service.EmployeeManage;

/**
 * 登录
 * 
 * @author huawangxin
 *
 * @date 2016年7月25日 下午3:06:13
 */
public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7065796810909021782L;
	@Autowired
	private EmployeeManage employeeManage;
	private Employee employee;
	
	public EmployeeManage getEmployeeManage() {
		return employeeManage;
	}

	public void setEmployeeManage(EmployeeManage employeeManage) {
		this.employeeManage = employeeManage;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request=ServletActionContext.getRequest();
//		System.out.println(request.getCharacterEncoding());//页面传过来的 编码格式
		String tempLoginName = employee.getLoginName();
		String tempPassword = employee.getPassword();
		Employee trueEmployee = null;
		if(("".equals(tempLoginName))||("".equals(tempPassword))){
			request.setAttribute("error_msg", "用户名或密码为空，请重新输入！");
			return "fail";
		}
		trueEmployee = employeeManage.queryEmployee(tempLoginName);
		if(trueEmployee==null){
			request.setAttribute("error_msg", "用户名不存在，请重新输入！");
			return "fail";
		}
		if(tempPassword.equals(trueEmployee.getPassword())){
			Map session=ActionContext.getContext().getSession();
			employee=trueEmployee;
			session.put("employee.name", employee.getName());
			return "success";
		}else{
			request.setAttribute("error_msg", "用户名或密码错误，请重新输入！");
			return "fail";
		}
	}
	
}
