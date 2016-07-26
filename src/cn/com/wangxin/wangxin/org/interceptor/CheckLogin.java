package cn.com.wangxin.wangxin.org.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * 登录拦截器
 * 
 * @author huawangxin
 *
 * @date 2016年7月25日 下午3:11:07
 */
public class CheckLogin implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6438782704300773854L;

	@Override
	public void destroy() {
		System.out.println("------CheckLogin.destroy------");
	}

	@Override
	public void init() {
		System.out.println("------CheckLogin.init------");

	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		
		System.out.println("------CheckLogin.intercept------");
		
		Map session=ActionContext.getContext().getSession();
		//Map userinfo=arg0.getInvocationContext().getParameters();
		
		//String username=session.get("user.name").toString();

		//String[] loginUsername=(String[])parameters.get("user.name");
		
		if(session.get("employee.name")!=null)
		{		
			return arg0.invoke();
		}
		session.put("error_msg", "登录异常，请重新登录！");
		
		return "loginFail";
	}

}
