package com.sadasen.core.response.status;

/**
 * @date 2018年3月9日
 * @author lei.ys
 * @addr company
 * @desc
 */
public enum Status {
	/**
	 * 请求成功
	 * code : 100
	 */
	SUCCESS,
	/**
	 * 请求出错（客户端错误通用）
	 * code : 600
	 */
	REQUEST_FAILURE,
	/**
	 * 请求参数缺失（无参数或参数值为空或其它非法值）
	 * code : 610
	 */
	REQUEST_LACK,
	/**
	 * 请求参数校验不通过（参数值不为空，但为不允许的值，如用户名不重复）
	 * code : 620
	 */
	REQUEST_VALID,
	/**
	 * 请求无权限
	 * code : 630
	 */
	REQUEST_PERMISSION,
	/**
	 * 请求不存在的或者已被删除的数据
	 * code : 640
	 */
	REQUEST_NOT_EXISTS,
	/**
	 * 系统错误（服务端错误）
	 * code : 800
	 */
	SYSTEM_ERROR
}
