package com.eachonline.demo.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 留给web层的controller使用，以json格式传递数据app等前端
 * 
 * @ClassName: JsonResult
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 剑神卓凌昭
 * @date 2015年11月20日 下午8:23:55
 *
 */
public class JsonResult {

	/**
	 * 模块名称
	 */
	private String module;

	/** 状态码 */
	private String code;

	/** 通知消息 */
	private String message;

	/** 数据 */
	private Object data;

	/**
	 * 额外数据：比如分页信息等
	 */
	private Map<String, Object> extraData = new HashMap<String, Object>();

	public JsonResult() {
		this(Boolean.TRUE, "");
	}

	public JsonResult(boolean success) {
		this(success, "");
	}

	public JsonResult(boolean success, Object data) {
		this(success, "", data);
	}

	public JsonResult(boolean success, String message) {
		this(success, message, null);
	}

	public JsonResult(boolean success, String message, Object data) {
		this.code = success ? "2000" : "5000";
		this.message = message;
		this.data = data;
	}

	public JsonResult(String code) {
		this(code, "");
	}

	public JsonResult(String code, String message) {
		this(code, message, null);
	}

	public JsonResult(String code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getExtraData() {
		return extraData;
	}

	public void addExtra(String key, Object value) {
		if (this.extraData == null) {
			this.extraData = new HashMap<String, Object>();
		}
		this.extraData.put(key, value);
	}

	public boolean isSuccess() {
		return this.code.equals("2000");
	}

	@Override
	public String toString() {
		return "JsonResult [module=" + module + ", code=" + code + ", message="
				+ message + ", data=" + data + ", extraData=" + extraData + "]";
	}

}
