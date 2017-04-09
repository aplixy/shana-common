package com.shana.exception;

public class ShanaException extends Exception {

	/**
		 * 
		 */
	private static final long serialVersionUID = -4411301323745284074L;
	private String code;

	public ShanaException(String code, String message, Throwable cause) {
		super(message, cause);
		this.code=code;
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
