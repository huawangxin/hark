package cn.com.wangxin.wangxin.org.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.opensymphony.xwork2.validator.annotations.EmailValidator;

import cn.com.wangxin.core.persistence.repository.IdEntity;
import cn.com.wangxin.wangxin.org.util.EmployeeStateEnum;

/**
 * 企业实体类
 * 
 * @author huawangxin
 *
 * @date 2016年7月25日 下午7:20:39
 */
@Entity
@Table(name = "hark_huawangxin_company")
public class Company extends IdEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4662170074566104698L;
	/**
	 * 店铺名称
	 */
	private String name;
	/**
	 * 组织编码
	 */
	private String orgUid;
	/**
	 * 店标
	 */
	private String url;
	/**
	 * 联系电话
	 */
	private String tel;
	/**
	 * 联系邮箱
	 */
	private String email;
	/**
	 * 联系地址
	 */
	private String address;
	/**
	 * 店长id
	 */
	private String bossId;
	/**
	 * 所属分组
	 */
	private String parentOrgUid;
	/**
	 * 状态状态
	 * 关联枚举类 EmployeeStateEnum
	 */
	private String state=EmployeeStateEnum.zc.getValue();;
	/**
	 * 创建时间
	 */
	private long createTime=System.currentTimeMillis();
	/**
	 * 排序
	 */
	private String sort;
	
	@Column(name="name", length=32)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="url", length=500)
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Column(name="tel", length=32)
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@EmailValidator
	@Column(name="email", length=32)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="adress", length=200)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name="bossId", length=32)
	public String getBossId() {
		return bossId;
	}
	public void setBossId(String bossId) {
		this.bossId = bossId;
	}
	@Column(name="orgUid", length=32)
	public String getOrgUid() {
		return orgUid;
	}
	public void setOrgUid(String orgUid) {
		this.orgUid = orgUid;
	}
	@Column(name="state", length=32)
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Column(name="createTime", length=32)
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	@Column(name="sort", length=32)
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	@Column(name="parentOrgUid", length=32)
	public String getParentOrgUid() {
		return parentOrgUid;
	}
	public void setParentOrgUid(String parentOrgUid) {
		this.parentOrgUid = parentOrgUid;
	}
	
	
	
}
