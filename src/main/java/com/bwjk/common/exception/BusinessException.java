package com.bwjk.common.exception;

public class BusinessException extends Exception {

	/**
	 * Generated serial version ID.
	 */
	private static final long serialVersionUID = 2803407019940110166L;

	/**
	 * Unified error code.
	 */
	private final String errorCode;
	
	/**
	 * Unified error code.
	 */
	private final String errorType;


	public BusinessException(String message,  String errorCode) {
		super(message);
		this.errorCode = errorCode;
		this.errorType = null;
	}
	
	public BusinessException( String message,  String errorCode, String errorType) {
		super(message);
		this.errorCode = errorCode;
		this.errorType = errorType;
	}
	public BusinessException( Throwable cause, String errorCode) {
		super(cause);
		this.errorCode = errorCode;
		this.errorType = null;
	}
	
	public BusinessException(Throwable cause,  String errorCode, String errorType) {
		super(cause);
		this.errorCode = errorCode;
		this.errorType = errorType;
	}

	public BusinessException( String message,Throwable cause, String errorCode, String errorType) {
		super(message, cause);
		this.errorCode = errorCode;
		this.errorType = errorType;
	}
	public BusinessException( String message,  Throwable cause,  String errorCode) {
		super(message, cause);
		this.errorCode = errorCode;
		this.errorType = null;
	}
	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorType() {
		return errorType;
	}

}
