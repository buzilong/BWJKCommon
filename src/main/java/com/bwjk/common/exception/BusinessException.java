package com.bwjk.common.exception;

public class BusinessException extends Exception {

	/**
	 * Generated serial version ID.
	 */
	private static final long serialVersionUID = 2803407019940110166L;

	/**
	 * Unified error code.
	 */
	private final String code;
	
	/**
	 * Unified error code.
	 */
	private final String type;
	
	private final String businessMessage;

	public BusinessException(String message,  String code) {
		super(message);
		this.businessMessage = message;
		this.code = code;
		this.type = null;
	}
	
	public BusinessException( String message,  String code, String type) {
		super(message);
		this.businessMessage = message;
		this.code = code;
		this.type = type;
	}
	public BusinessException( Throwable cause, String code) {
		super(cause);
		this.businessMessage = null;
		this.code = code;
		this.type = null;
	}
	
	public BusinessException(Throwable cause,  String code, String type) {
		super(cause);
		this.businessMessage = null;
		this.code = code;
		this.type = type;
	}

	public BusinessException( String message,Throwable cause, String code, String type) {
		super(message, cause);
		this.businessMessage = message;
		this.code = code;
		this.type = type;
	}
	public BusinessException( String message,  Throwable cause,  String code) {
		super(message, cause);
		this.businessMessage = message;
		this.code = code;
		this.type = null;
	}
	public String getCode() {
		return code;
	}

	public String getType() {
		return type;
	}

	public String getBusinessMessage() {
		return businessMessage;
	}


}
