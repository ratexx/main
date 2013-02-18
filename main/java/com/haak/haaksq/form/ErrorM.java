package com.haak.haaksq.form;

import java.io.Serializable;

public class ErrorM implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorCode ;
	private String errorMsg;
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
