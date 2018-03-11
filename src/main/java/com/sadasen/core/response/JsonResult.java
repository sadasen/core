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
	
	private JsonResult(Object data) {
		this.data = data;
	}
	
	private JsonResult(Status codeNemu, String msg) {
		switch(codeNemu) {
		case REQUEST_FAILURE:
			code = Code.REQUEST_ERROR_CODE; break;
		case REQUEST_LACK:
			code = Code.REQUEST_PARAM_LACK_CODE; break;
		case REQUEST_VALID:
			code = Code.REQUEST_PARAM_VALID_CODE; break;
		case REQUEST_PERMISSION:
			code = Code.REQUEST_PERMISSION_CODE; break;
		case REQUEST_NO_EXISTS:
			code = Code.REQUEST_NO_EXISTS_CODE; break;
		case SYSTEM_ERROR:
			code = Code.SYSTEM_ERROR_CODE; break;
		default:
			code = Code.REQUEST_SUCCESS_CODE; break;
		}
		if(null==msg) {
			if(4==code%10) {
				msg = Code.REQUEST_ERROR_TIP;
			} else if(5==code%10) {
				msg = Code.SYSTEM_ERROR_TIP;
			}
		}
	}
	
	public static JsonResult instance() {
		return new JsonResult();
	}
	
	public static JsonResult instance(Object object) {
		return new JsonResult(object);
	}
	
	public static JsonResult instance(Status code) {
		return new JsonResult(code, null);
	}
	
	public static JsonResult instance(String msg, Status code) {
		return new JsonResult(code, msg);
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
		case REQUEST_NO_EXISTS:
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
