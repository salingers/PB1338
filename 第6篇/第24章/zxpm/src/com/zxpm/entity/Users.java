package com.zxpm.entity;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */
public class Users implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String password;
	private String telephone;
	private String address;	

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String userName, String password, String telephone,
			String address) {
		this.userName = userName;
		this.password = password;
		this.telephone = telephone;
		this.address = address;		
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}