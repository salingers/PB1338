package action;

import com.opensymphony.xwork2.ActionSupport;

public class Struts2YanZheng extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String user;
	private String pass;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
