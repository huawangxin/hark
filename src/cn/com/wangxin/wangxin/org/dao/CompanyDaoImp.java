package cn.com.wangxin.wangxin.org.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cn.com.wangxin.wangxin.org.entity.Company;

public class CompanyDaoImp implements CompanyDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addCompany(Company company) {
		getSession().save(company);
	}

	@Override
	public void modifyCompany(Company company) {
		getSession().save(company);
	}

	@Override
	public void deleteCompany(Company company) {
		getSession().delete(company);
	}

	@Override
	public List<Company> queryCompanys() {
		Query query=getSession().createQuery(" select * from hark_huawangxin_company order by orguid ");
		List<Company> companys=query.list();
		return companys;
	}

}
