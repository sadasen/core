package com.sadasen.core.response.status;

import java.io.Serializable;

/**
 * @date 2018年3月11日
 * @author lei.ys
 * @addr company
 * @desc
 */
public class Code implements Serializable {

	private static final long serialVersionUID = -7115441934842593236L;
	
	// ====== 返回状态码
	// 请求成功
	public static final int REQUEST_SUCCESS_CODE = 100;
	// 请求出错（客户端错误通用）
	public static final int REQUEST_ERROR_CODE = 600;
	// 请求参数缺失（无参数或参数值为空，如string类型的值为""）
	public static final int REQUEST_PARAM_LACK_CODE = 610;
	// 请求参数校验不通过（参数值不为空，但为不允许的值，如用户名不重复）
	public static final int REQUEST_PARAM_VALID_CODE = 620;
	// 请求无权限
	public static final int REQUEST_PERMISSION_CODE = 630;
	// 请求不存在的或者已被删除的
	public static final int REQUEST_NO_EXISTS_CODE = 640;
	// 系统错误（服务端错误）
	public static final int SYSTEM_ERROR_CODE = 800;
	// 请求成功通用提示
	public static final String REQUEST_SUCCESS_TIP = "请求成功";
	// 请求错误通用提示
	public static final String REQUEST_ERROR_TIP = "请求无效！";
	// 系统错误通用提示
	public static final String SYSTEM_ERROR_TIP = "系统错误！";

}
