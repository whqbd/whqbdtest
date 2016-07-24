package  com.eachonline.demo.util;

import java.io.Serializable;

public class Result<T>  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1060487230667920825L;
	private boolean success = true;
	private int retCode = 0;
	private String msg;
	private T retObj;

	//页偏移量 //
	protected int pageNo = 1;

	//每页记录数量 //
	protected int pageSize = 10;

	//记录总数
	protected long totalCount = 0;
	
	public Result() {}

	public Result(T object) {
		this.retObj = object;
	}

	public Result(int code, T object) {
		this.retCode = code;
		this.retObj = object;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getRetCode() {
		return retCode;
	}

	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getRetObj() {
		return retObj;
	}

	public void setRetObj(T retObj) {
		this.retObj = retObj;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	
}
