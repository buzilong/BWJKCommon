package com.bwjk.common.basedto;

public class AuthInfo {

	private String userId;
	private String accName;
	private long refreshTime;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public long getRefreshTime() {
		return refreshTime;
	}

	public void setRefreshTime(long refreshTime) {
		this.refreshTime = refreshTime;
	}

}
