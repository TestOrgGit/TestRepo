package com.models.admin;

public class Credential {

	private String userName;
	private String password;
	private String email;
	private String tokenId;
	private long tokenInTime;
	private long tokenExpireTime;
	
	public String getTokenId() {
		return tokenId;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	public long getTokenInTime() {
		return tokenInTime;
	}
	public void setTokenInTime(long tokenInTime) {
		this.tokenInTime = tokenInTime;
	}
	public long getTokenExpireTime() {
		return tokenExpireTime;
	}
	public void setTokenExpireTime(long tokenExpireTime) {
		this.tokenExpireTime = tokenExpireTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
