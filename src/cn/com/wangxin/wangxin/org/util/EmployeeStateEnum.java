package cn.com.wangxin.wangxin.org.util;

/**
 * 使用该类型的实体类：员工，公司
 * 
 * @author huawangxin
 *
 * @date 2016年7月26日 上午9:00:11
 */
public enum EmployeeStateEnum {
	QXZ("","请选择"),
	zc("1","正常"),
	ty("2","停用"),
	zx("3","注销"),
	sc("4","删除");
	private final String value;
	private final String desc;

	EmployeeStateEnum(String value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	public String getValue() {
		return value;
	}

	public String getDesc() {
		return desc;
	}

	public static String getDescByValue(String value) {
		for (EmployeeTypeEnum type : EmployeeTypeEnum.values()) {
			if (type.getValue().equals(value))
				return type.getDesc();
		}
		return "";
	}
}
