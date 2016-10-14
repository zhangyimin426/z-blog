package com.zym.blog.statuscode;

/**
 * 全局结果状态码
 *
 * @author Gavin
 * @date 2016-09-27
 */
public class GlobalResultStatus {
	public static final ResultStatus SUCCESS = new ResultStatus(0, "成功");

	public static final ResultStatus AUTH_MISSING = new ResultStatus(100010100, "缺少授权信息");
	public static final ResultStatus ACCESS_TOKEN_ERROR = new ResultStatus(100010101, "accessToken错误或已过期");
	public static final ResultStatus REFRESH_TOKEN_ERROR = new ResultStatus(100010102, "refreshToken错误或已过期");
	public static final ResultStatus APPID_ERROR = new ResultStatus(100010103, "AppId不合法");
	public static final ResultStatus TIMESTAMP_EXPIRED = new ResultStatus(100010104, "timestamp过期");
	public static final ResultStatus SIGNATURE_ERROR = new ResultStatus(100010105, "签名错误");
	public static final ResultStatus REQUEST_URL_ERROR = new ResultStatus(100010106, "请求地址错误");
	public static final ResultStatus REQUEST_SCHEME_ERROR = new ResultStatus(100010107, "请求Scheme错误");
	public static final ResultStatus REQUEST_METHOD_ERROR = new ResultStatus(100010108, "请求方法错误");
	public static final ResultStatus SERVICE_TIMEOUT = new ResultStatus(100010109, "服务处理超时");
    public static final ResultStatus USER_LOGIN_SESSION_TIME_OUT = new ResultStatus(100010110,"用户未登录");
	
	public static final ResultStatus ERROR = new ResultStatus(100010200, "失败");
	public static final ResultStatus PARAM_MISSING = new ResultStatus(100010201, "缺少参数");
	public static final ResultStatus PARAM_APPKEY_MISSING = new ResultStatus(100010202, "缺少appKey参数");
	public static final ResultStatus PARAM_ACCESSTOKEN_MISSING = new ResultStatus(100010203, "缺少accessToken参数");
	public static final ResultStatus PARAM_TIMESTAMP_MISSING = new ResultStatus(100010204, "缺少timestamp参数");
	public static final ResultStatus PARAM_SOURCE_MISSING = new ResultStatus(100010205, "缺少source参数");
	public static final ResultStatus PARAM_ERROR = new ResultStatus(100010206, "参数错误");
	public static final ResultStatus MUST_USE_HTTPS = new ResultStatus(100010207, "必须使用https");
	public static final ResultStatus PARAM_DELETE_LIMIT = new ResultStatus(100010208, "参数删除不允许");
	public static final ResultStatus PARAM_SAME_POSITION = new ResultStatus(100010209, "推荐位置相同");
	public static final ResultStatus PARAM_LENGTH_ERROR = new ResultStatus(100010210, "参数长度错误");
	public static final ResultStatus PHONE_OR_EMAIL_ERROR = new ResultStatus(100010211, "手机或邮箱不正确");

	public static final ResultStatus ACCOUNT_REGISTERED = new ResultStatus(100021000, "帐号已注册");
	public static final ResultStatus ACCOUNT_NOT_REGISTERED = new ResultStatus(100021001, "帐号未注册");
	public static final ResultStatus ACCOUNT_ERROR = new ResultStatus(100021002, "帐号错误");
	public static final ResultStatus ACCOUNT_ACTIVATES = new ResultStatus(100021003, "帐号未激活");
	public static final ResultStatus ACCOUNT_NOT_INVITE = new ResultStatus(100021004, "帐号未邀请");
	public static final ResultStatus ACCOUNT_INVITE = new ResultStatus(100021005, "帐号邀请状态");
	public static final ResultStatus ACCOUNT_SSO = new ResultStatus(100021006, "帐号在其它手机已登录");
	public static final ResultStatus ACCOUNT_HAS_INVITE = new ResultStatus(100021007, "帐号已邀请");
	public static final ResultStatus INVITED_DEVICE_HAS_UNBIND = new ResultStatus(100021008, "邀请你的用户已解绑该设备");

	public static final ResultStatus PHONE_REGISTERED = new ResultStatus(100021100, "手机号码已注册");
	public static final ResultStatus PHONE_NOT_REGISTERED = new ResultStatus(100021101, "手机号码未注册");

	public static final ResultStatus EMAIL_REGISTERED = new ResultStatus(100021200, "邮箱已注册");
	public static final ResultStatus EMAIL_NOT_REGISTERED = new ResultStatus(100021201, "邮箱未注册");

	public static final ResultStatus SEND_VERI_CODE_FAIL = new ResultStatus(100021300, "发送验证码失败");
	public static final ResultStatus VERI_CODE_ERROR = new ResultStatus(100021301, "验证码错误");
	public static final ResultStatus RANDOM_CODE_ERROR = new ResultStatus(100021302, "随机码错误");

	public static final ResultStatus USER_EXIST = new ResultStatus(100021400, "用户已存在");
	public static final ResultStatus USER_NOT_EXIST = new ResultStatus(100021401, "用户不存在");
	public static final ResultStatus THIRDID_ERROR = new ResultStatus(100021402, "第三方ID错误");
	public static final ResultStatus THIRDID_UNBIND = new ResultStatus(100021403, "第三方账号解绑失败");
	public static final ResultStatus THIRDID_YETBIND = new ResultStatus(100021404, "第三方账号已经被其他用户绑定");
	public static final ResultStatus THIRDID_NOTBIND = new ResultStatus(100021404, "第三方账号绑定关系不存在");
	public static final ResultStatus THIRDID_FAILURE = new ResultStatus(100021403, " 第三方账号登录失败");
	public static final ResultStatus USER_LOCKED = new ResultStatus(100021405, "用户被锁定");
	public static final ResultStatus USER_LOGIN_FAILED = new ResultStatus(100021406, "用户名/密码错误");
	
	
	public static final ResultStatus PASSWORD_ERROR = new ResultStatus(100021500, "密码错误");
	public static final ResultStatus NEWPASSWORD_ERROR = new ResultStatus(100021501, "新密码前后输入不一致");

	public static final ResultStatus IMAGE_FORMAT_ERROR = new ResultStatus(100021700, "图片格式不支持");
	public static final ResultStatus FILE_SERVICE_DISABLED = new ResultStatus(100021701, "文件服务不可用");


	public static final ResultStatus CAN_NOT_ADD_SELF_AS_FRIEND = new ResultStatus(100022100, "不能加自己为好友");
	public static final ResultStatus HAS_REQUESTED_ADD_FRIEND = new ResultStatus(100022101, "已请求加好友");
	public static final ResultStatus UNREQUESTED_ADD_FRIEND = new ResultStatus(100022102, "未请求加好友");
	public static final ResultStatus IS_FRIEND = new ResultStatus(100022103, "已成为好友");
	public static final ResultStatus IS_NOT_FRIEND = new ResultStatus(100022104, "非好友");

	public static final ResultStatus PUSH_BIND_ERROR = new ResultStatus(100022600, "推送信息绑定失败");
	public static final ResultStatus PUSH_UNBIND_ERROR = new ResultStatus(100022601, "推送信息解绑失败");
	
	public static final ResultStatus APP_VERSION_NOT_EXIST = new ResultStatus(100022700, "APP版本不存在");
	public static final ResultStatus UPGRADE_FILE_NOT_EXIST = new ResultStatus(100022701, "升级文件不存在");
	public static final ResultStatus NO_VERSION_RESET = new ResultStatus(100022705, "没有可重置的版本");
	public static final ResultStatus UPGRADE_CMD_NOT_FOUND = new ResultStatus(100022706, "升级命令未找到");
	

	public static final ResultStatus QRCODE_REQUEST_CONTINUE = new ResultStatus(100022900, "继续请求");
	public static final ResultStatus QRCODE_REQUEST_NEW = new ResultStatus(100022901, "重新请求");
	public static final ResultStatus QRCODE_SCAN = new ResultStatus(100022902, "二维码已扫描");
	public static final ResultStatus QRCODE_LOGIN = new ResultStatus(100022903, "二维码已登录");

	public static final ResultStatus QRCODE_UUID_INVALID = new ResultStatus(100022904, "二维码期效已过");

	public static final ResultStatus DATA_EXISTS = new ResultStatus(1000221001,"该数据已存在");
	public static final ResultStatus ORDER_EXISTS = new ResultStatus(1000221000, "该序号已经存在");


}
