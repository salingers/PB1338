package action;

import com.opensymphony.xwork2.ActionSupport;

public class OneAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String user;
	private String pass;

	private String name;
	private int age;
	private String pass1;
	private String pass2;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	public String login() {
		return SUCCESS;
	}

	public void validateLogin() {
		if (!"niukor".equals(getUser()) && !"niukor".equals(getPass())) {
			this.addFieldError("user", "使用者名稱或密碼不對！");
		}
	}

	public String reg() {
		return SUCCESS;

	}

	public void validateReg() {
		if (getName() == null || "".equals(getName())) {
			this.addFieldError("name", "使用者名稱不能為空！");
		}
		if (getAge() > 130 || getAge() < 0) {
			this.addFieldError("age", "年齡有問題！");
		}
		if (getPass1() == null || "".equals(getPass1())
				|| !getPass1().equals(getPass2())) {
			this.addFieldError("pass1", "密碼有問題！");
		}
	}

}
