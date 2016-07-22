package cn.com.wangxin.wangxin.org.util;

public enum EmployeeTypeEnum {
	QXZ("","请选择"),
	SXS("1","实习生"),
	SYS("2","试用生"),
	ZSYG("3", "正式员工"), 
	BZ("4","班长"),
	KZ("5","科长"),
	JL("6","经理"),
	ZJL("7","总经理"),
	DSZ("8","董事长");
	private final String value;
	private final String desc;

	EmployeeTypeEnum(String value, String desc) {
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
