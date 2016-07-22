package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String username;
	private String pass1;
	private String pass2;
	
	
	@Override
	public String execute() throws Exception {
		if (username != null && getPass1().equals(getPass2()) && !getUsername().trim().equals("")) {
			
			System.out.print("正在執行action！……");
			return SUCCESS;
			
		}else {
			System.out.print("正在執行action！……");
			return INPUT;
		}
	}
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass1() {
		return pass1;
	}

	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}

	public String getPass2() {
		return pass2;
	}

	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}

}
