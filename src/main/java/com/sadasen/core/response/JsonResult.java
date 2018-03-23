package com.sadasen.core.response;

import com.sadasen.core.response.status.Code;
import com.sadasen.core.response.status.Status;

/**
 * @date 2018年3月8日
 * @author lei.ys
 * @addr company
 * @desc
 */
public class JsonResult {
	
	private Object data;
	private int code = Code.REQUEST_SUCCESS_CODE;
	private String msg = "";
	
	private JsonResult() {
	}
	
	public static JsonResult instance(Status status, String msg, Object data) {
		JsonResult result = new JsonResult();
		result.setCode(status);
		if(null==msg || "".equals(msg.trim())) {
			if(1==result.getCode()/100) {
				result.setMsg(Code.REQUEST_SUCCESS_TIP);
			} else if(6==result.getCode()/100) {
				result.setMsg(Code.REQUEST_ERROR_TIP);
			} else if(8==result.getCode()/100) {
				result.setMsg(Code.SYSTEM_ERROR_TIP);
			} else {
				result.setMsg("系统返回数据JsonResult出现严重问题！");
			}
		} else {
			result.setMsg(msg);
		}
		result.setData(data);
		return result;
	}
	
	public static JsonResult instance() {
		return instance(Status.SUCCESS, Code.REQUEST_SUCCESS_TIP, null);
	}
	
	public static JsonResult instance(Object data) {
		return instance(Status.SUCCESS, Code.REQUEST_SUCCESS_TIP, data);
	}
	
	public static JsonResult instance(Status code) {
		return instance(code, null, null);
	}
	
	public static JsonResult instance(String msg) {
		return instance(Status.SUCCESS, msg, null);
	}
	
	public static JsonResult instance(Status code, String msg) {
		return instance(code, msg, null);
	}
	
	public static JsonResult instance(Status code, Object data) {
		return instance(code, null, data);
	}
	
	public static JsonResult instance(String msg, Object data) {
		return instance(Status.SUCCESS, msg, data);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(Status codeNemu) {
		switch(codeNemu) {
		case REQUEST_FAILURE:
			code = Code.REQUEST_ERROR_CODE; break;
		case REQUEST_LACK:
			code = Code.REQUEST_PARAM_LACK_CODE; break;
		case REQUEST_VALID:
			code = Code.REQUEST_PARAM_VALID_CODE; break;
		case REQUEST_PERMISSION:
			code = Code.REQUEST_PERMISSION_CODE; break;
		case REQUEST_NOT_EXISTS:
			code = Code.REQUEST_NO_EXISTS_CODE; break;
		case SYSTEM_ERROR:
			code = Code.SYSTEM_ERROR_CODE; break;
		default:
			code = Code.REQUEST_SUCCESS_CODE; break;
		}
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
