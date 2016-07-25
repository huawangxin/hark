package cn.com.wangxin.wangxin.org.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.NumberFormat;

import com.opensymphony.xwork2.validator.annotations.EmailValidator;

import cn.com.wangxin.core.persistence.repository.IdEntity;
import cn.com.wangxin.wangxin.org.util.EmployeeStateEnum;
import cn.com.wangxin.wangxin.org.util.EmployeeTypeEnum;

/**
 * 员工实体类
 * 
 * @author huawangxin
 *
 * @date 2016年7月25日 下午2:25:40
 */
@Entity
@Table(name = "hark_huawangxin_emploee")
public class Employee extends IdEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1629755507996521440L;
	/**
	 * 登录名
	 */
	private String loginName;
	/**
	 * 密码
	 */
	private String password="123456";
	/**
	 * 员工姓名
	 */
	private String name;
	/**
	 * 头像
	 * (关联附件表中的ID)
	 */
	private String imageUrl;
	/**
	 * 联系电话
	 */
	private String phone;
	/**
	 * 联系邮箱
	 */
	private String email;
	/**
	 * 工号
	 */
	private String jobNum;
	/**
	 * 所属部门
	 */
	private String groupId;
	/**
	 * 用户类型
	 * 关联枚举类 EmployeeTypeEnum
	 */
	private String employeeType=EmployeeTypeEnum.ZSYG.getValue();
	/**s
	 * 所属企业
	 * (关联 企业id)
	 */
	private String enterpriseId;
	/**
	 * 入职时间
	 */
	private long createTime;
	/**
	 * 员工状态
	 * 关联枚举类 EmployeeStateEnum
	 */
	private String state=EmployeeStateEnum.zc.getValue();
	
	@Column(name="loginName", length=32, nullable=false, unique=true)
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	@Column(name="password", length=32, nullable=false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="name", length=32)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="imageUrl", length=500)
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@NumberFormat
	@Column(name="phone", length=32)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@EmailValidator
	@Column(name="email", length=200)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="jobNum", length=32)
	public String getJobNum() {
		return jobNum;
	}
	public void setJobNum(String jobNum) {
		this.jobNum = jobNum;
	}
	@Column(name="groupId", length=32)
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	@Column(name="employeeType", length=32)
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	@Column(name="enterpriseId", length=32)
	public String getEnterpriseId() {
		return enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	@Column(name="createTime", length=32)
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	@Column(name="state", length=32)
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
