package cn.com.wangxin.wangxin.org.util;

public class OrgConstants {
	// root
	public final static String LOGIN_ROOT_KEY = "root";
	// admin
	public final static String LOGIN_ADMIN_KEY = "admin";

	// root部门
	public final static String LOGIN_ROOT_DEP_KEY = "sys_dep";
	// 普通用户 角色编码
	public final static String ROLE_NORMAL = "role_normal";
	// 部门分类
	public static final String ORG_TYPE_ALL = "00";// 所有单位和处室
	public static final String ORG_TYPE_DEP = "10";// 获取单位
	public static final String ORG_TYPE_GROUP = "01";// 获取处室

	// 默认部门
	public final static String ORG_WZ = "001";

	// session中变量
	/** 登录名，String */
	public final static String SESSION_USER_KEY = "session_user_key";
	/** 用户名，String */
	public final static String SESSION_USER_NAME = "session_user_name";
	/** 组织Uid，String */
	public final static String SESSION_ORG_ID = "session_org_id";
	/** 组织名，String */
	public final static String SESSION_ORG_NAME = "session_org_name";
	/** 用户权限，List<OrgPermission> */
	public final static String SESSION_USER_PERMISSION = "session_user_permission";

	// 系统管理相关权限
	public final static String PERMISSION_XTGL = "xtgl";// 系统管理

	public final static String PERMISSION_XTGL_YHSQ = "xtgl.yhsq";// 用户授权
	
	public final static String PERMISSION_XTGL_JSGL = "xtgl.jsgl";// 角色管理
	public final static String PERMISSION_XTGL_QXGL = "xtgl.qxgl";// 权限管理
	public final static String PERMISSION_XTGL_CZRZ = "xtgl.czrz";// 操作日志
	public final static String PERMISSION_XTGL_KHFS = "xtgl.khfs";// 考核分数配置
	
	
	public final static String PERMISSION_XXTJ = "xxtj";// 信息统计

	public final static String PERMISSION_XXWH = "xxwh";// 信息维护
	
	
	
	
	public final static String PERMISSION_XXGL = "xxgl";// 信息管理
	
	public final static String PERMISSION_XXGL_XJKH = "xxgl.xjkh";// 星级考核
	
	public final static String PERMISSION_XXGL_ZDJS = "xxgl.zdjs";// 制度建设信息
	
	
	
	public final static String PERMISSION_XXGL_DC = "xxgl.dc";// 督查
	public final static String PERMISSION_XXGL_DCCK = "xxgl.dcck";// 督查查看
	
	
	public final static String PERMISSION_XXGL_GAFK = "xxgl.gafk";// 个案反馈
	public final static String PERMISSION_XXGL_GAFKCK = "xxgl.gafkck";// 上级反馈查看
	
	public final static String PERMISSION_XXGL_SPSB = "xxgl.spsb";// 审批上报
	
	public final static String PERMISSION_XXGL_CX = "xxgl.cx";// 查询

	
	
	
	
	// 信息上报相关权限
	public final static String PERMISSION_XXSB_XXCJ = "xxsb.xxcj";// 信息上报采集权限
	public final static String PERMISSION_XXSB_XXCS = "xxsb.xxcs";// 信息上报初审权限
	public final static String PERMISSION_XXSB_ZRSH = "xxsb.zrsh";// 信息上报主任审核权限PERMISSION_XXSB_XXZS
	public final static String PERMISSION_XXSB_JZSH = "xxsb.jzsh";// 信息上报局长审核权限
	public final static String PERMISSION_XXSB_XXFB = "xxsb.xxfb";// 信息上报发布权限
	public final static String PERMISSION_XXSB_XXSBSFT = "xxsb.xxsbsft";// 信息上报司法厅权限
	/** 这个只在InfoAction查询里面才被用到，其它地方都没自觉用，而且正式库里都没这个数据，暂时先放着吧 */
	public final static String PERMISSION_XXSB_SYXX = "xxsb.syxx";// 信息上报所有权限
	public final static String PERMISSION_XXSB_XXSC = "xxsb.xxsc";// 信息上报删除权限

	// 报表管理相关权限
	public final static String PERMISSION_BBXT_BBGL = "bbxt.bbgl";// 报表系统报表管理
	public final static String PERMISSION_BBXT_BBSB = "bbxt.bbsb";// 报表系统报表上报
	
	// 会议报送
	public final static String PERMISSION_HYBS_BSMD = "hybs.bsmd"; //会议报送报送名单
	public final static String PERMISSION_HYBS_FQHY = "hybs.fqhy"; //会议报送发起会议
	
	// 电子台账模块相关权限
	public final static String PERMISSION_DZTZ_TZGL = "dztz.tzgl"; //电子台账台账管理
	
	//TODO 新的star专用项目 
	public final static String PERMISSION_XXWH_DWJS = "xxwh.dwjs";// 信息维护队伍建设

}
