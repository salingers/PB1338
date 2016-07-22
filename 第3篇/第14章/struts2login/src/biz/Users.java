package biz;

public class Users {
	private int userid;
	private String username;
	private String password;
	private int sex;
	private String email;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Users(String username, String password, int sex, String email) {
		super();
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.email = email;
	}

	public Users(int userid, String username, String password, int sex,
			String email) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.email = email;
	}

	public Users() {
		super();
	}

}
