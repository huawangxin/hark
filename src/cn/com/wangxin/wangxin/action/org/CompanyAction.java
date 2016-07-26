package cn.com.wangxin.wangxin.action.org;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.wangxin.wangxin.org.entity.Company;
import cn.com.wangxin.wangxin.org.service.CompanyManage;

/**
 * 企业
 * 
 * @author huawangxin
 *
 * @date 2016年7月25日 下午3:08:21
 */
public class CompanyAction extends ActionSupport {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 4531422648627373251L;

	private Company company;

	@Resource  
	private CompanyManage companyManage;
	

	public void setCompanyManage(CompanyManage companyManage) {
		this.companyManage = companyManage;
	}
	
	public CompanyManage getCompanyManage() {
		return companyManage;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company Company) {
		this.company = Company;
	}
	
	public String addCompany()
	{
		System.out.println("-------CompanyAction.addCompany--------"+company.getName());
		
		companyManage.addCompany(company);
		return "success";
	}
	
	public String modifyCompany()
	{
		System.out.println("-------CompanyAction.modifyCompany--------"+company.getName());
		companyManage.modifyCompany(company);
		return "success";
	}
	
	public String deleteCompany()
	{
		System.out.println("-------CompanyAction.deleteCompany--------"+company.getName());
		companyManage.deleteCompany(company);
		return "success";
	}
	
	
}
