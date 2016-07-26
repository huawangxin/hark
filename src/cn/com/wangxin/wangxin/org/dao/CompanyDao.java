package cn.com.wangxin.wangxin.org.dao;

import java.util.List;

import cn.com.wangxin.wangxin.org.entity.Company;

public interface CompanyDao {
	public void addCompany(Company company);
	public void modifyCompany(Company company);
	public void deleteCompany(Company company);
	public List<Company> queryCompanys();
}
