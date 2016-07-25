package cn.com.wangxin.wangxin.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 统一设置字符集
 * 
 * @author huawangxin
 *
 * @date 2016年7月25日 下午2:21:57
 */
public class CharsetEncodingFilter implements Filter {
	
	private String encoding;
	
	public void destroy() {
	}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain filterChain) throws IOException, ServletException {
		
		//设置字符集
		servletRequest.setCharacterEncoding(encoding);
		filterChain.doFilter(servletRequest, servletResponse);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		//取得初始化参数
		this.encoding = filterConfig.getInitParameter("encoding");
	}
}
