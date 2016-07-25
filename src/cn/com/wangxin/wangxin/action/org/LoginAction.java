package cn.com.wangxin.wangxin.action.org;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.com.wangxin.wangxin.org.entity.Employee;

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
	
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request=ServletActionContext.getRequest();
		
		System.out.println(request.getCharacterEncoding());
		
		if("root".equals(employee.getLoginName()) && "123456".equals(employee.getPassword()))
		{
			Map session=ActionContext.getContext().getSession();
			session.put("employee.name", employee.getName());
			
			System.out.println("登录成功,用户名="+employee.getLoginName());
			return "success";
		}
		
		System.out.println("登录失败，用户名="+employee.getName());
		return "fail";
	}
	
}
