package action;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;

public class YanZhengAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private String user ;
	private String sex;
	private String pass;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	@Override
	public void validate() {
		if (getUser() == null || "".equals(getUser().trim())) {
			this.addFieldError("user", "使用者名稱不能為空！");
		} else {
			Pattern p = Pattern.compile("\\w{6,20}");
			Matcher m = p.matcher(getUser().trim());
			if (!m.matches()) {
				this.addFieldError("user", "使用者名稱由下劃線、字母、數字構成，長度為6-20");
			} 
		}
		if(getSex() == null || "".equals(getSex().trim())){
			this.addFieldError("sex", "性別不能為空！");
		}else if(getSex() != "男" || getSex() != "女"){
		
			this.addFieldError("sex", "性別只能是男和女！");
		}
		
		if (getPass() == null || "".equals(getPass().trim())) {
			this.addFieldError("pass", "密碼不能為空！");
		} else {
			int s = getPass().trim().length();
			if (s<6 || s>30) {
				this.addFieldError("pass", "密碼長度為應該在6-30之間！");
			} 
		}
	}
	

}
