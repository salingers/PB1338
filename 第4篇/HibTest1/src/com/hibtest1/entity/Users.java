package com.hibtest1.entity;

import java.io.Serializable;

public class Users implements Serializable {
	private Integer id;         //�s��
	private String loginName;   //�ϥΪ̦W��
	private String loginPwd;    //�K�X
	//�w�]�غc��k
	public Users() {		
	}
	//�ݩ�id��get��k
	public Integer getId() {    
		return id;
	}
	//�ݩ�id��set��k
	public void setId(Integer id) {   
		this.id = id;
	}
	//�ݩ�loginName��get��k
	public String getLoginName() {    
		return loginName;
	}
	//�ݩ�loginName��set��k
	public void setLoginName(String loginName) {   
		this.loginName = loginName;
	}
	//�ݩ�loginPwd��get��k
	public String getLoginPwd() {
		return loginPwd;
	}
	//�ݩ�loginPwd��set��k
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

}
