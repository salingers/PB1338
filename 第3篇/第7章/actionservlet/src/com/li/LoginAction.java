package com.li;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;

	@Override
	public String execute() throws Exception {

		ActionContext ac = ActionContext.getContext();

		if ("zhangsan".equals(userName) && "123456".equals(password)) {
			ac.put("success", "�n�J���\");
			return Action.SUCCESS;
		} else {
			ac.put("error", "�ϥΪ̦W�٩αK�X���~");
			return Action.ERROR;
		}
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
}
