package cn.com.wangxin.wangxin.org.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 员工实体类
 * 
 * @author huawngxin
 *
 */
@Entity
@Table(name = "hark_huawangxin_emploee")
public class Employee {

	/**
	 * ID
	 */
	private String id;
	/**
	 * 登录名
	 */
	private String loginName;
	/**
	 * 密码
	 */
	private String password;
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
	private String employeeType;
	/**
	 * 所属企业
	 * (关联 企业id)
	 */
	private String enterpriseId;
	/**
	 * 入职时间
	 */
	private long createTime;
	
	
	
	
	
}
