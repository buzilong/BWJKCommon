package com.bwjk.common.basedto;

import java.util.ArrayList;
import java.util.List;

public class BaseReponseDTO {

	private List<ErrorInfo> errorList;

	public List<ErrorInfo> getErrorList() {
		return errorList;
	}

	public void setErrorList(List<ErrorInfo> errorList) {
		this.errorList = errorList;
	}

	public void addError(ErrorInfo errorInfo) {
		if (errorList == null) {
			errorList = new ArrayList<>();
		}
		errorList.add(errorInfo);
	}

	public void addAllErrors(List<ErrorInfo> errorInfos) {
		if (errorInfos != null) {
			if (errorList == null) {
				errorList = new ArrayList<>();
			}
			errorList.addAll(errorInfos);
		}

	}
}
