package com.pettify.beta.businessbean;

public class UserCredentialBean {
	
	private Integer id;
	private String userEmail;
	private String password;
	
	public UserCredentialBean() {
		super();
	}

	public UserCredentialBean(Integer id, String userEmail, String password) {
		super();
		this.id = id;
		this.userEmail = userEmail;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserCredentialBean [id=" + id + ", userEmail=" + userEmail + ", password=" + password + "]";
	}
	
	
	
}
