package com.bwjk.common.basedto;

public class ValidationError extends ErrorInfo {

	private String fieldName;

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
}
