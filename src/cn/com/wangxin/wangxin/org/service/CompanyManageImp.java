package cn.com.wangxin.wangxin.org.service;

import java.util.List;

import javax.annotation.Resource;

import cn.com.wangxin.wangxin.org.dao.CompanyDao;
import cn.com.wangxin.wangxin.org.entity.Company;

public class CompanyManageImp implements CompanyManage{
	
	@Resource  
	private CompanyDao companyDao;
	
	public CompanyDao getCompanyDao() {
		return companyDao;
	}

	public void setCompanyDao(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}

	@Override
	public void addCompany(Company company) {
		companyDao.addCompany(company);
	}

	@Override
	public void modifyCompany(Company company) {
		companyDao.modifyCompany(company);
	}

	@Override
	public void deleteCompany(Company company) {
		companyDao.deleteCompany(company);
	}

	@Override
	public List<Company> queryCompany() {
		List<Company> companys=companyDao.queryCompanys();
		return companys;
	}

	
}
