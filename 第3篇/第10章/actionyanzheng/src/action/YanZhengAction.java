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
			this.addFieldError("user", "�ϥΪ̦W�٤��ର�šI");
		} else {
			Pattern p = Pattern.compile("\\w{6,20}");
			Matcher m = p.matcher(getUser().trim());
			if (!m.matches()) {
				this.addFieldError("user", "�ϥΪ̦W�٥ѤU���u�B�r���B�Ʀr�c���A���׬�6-20");
			} 
		}
		if(getSex() == null || "".equals(getSex().trim())){
			this.addFieldError("sex", "�ʧO���ର�šI");
		}else if(getSex() != "�k" || getSex() != "�k"){
		
			this.addFieldError("sex", "�ʧO�u��O�k�M�k�I");
		}
		
		if (getPass() == null || "".equals(getPass().trim())) {
			this.addFieldError("pass", "�K�X���ର�šI");
		} else {
			int s = getPass().trim().length();
			if (s<6 || s>30) {
				this.addFieldError("pass", "�K�X���׬����Ӧb6-30�����I");
			} 
		}
	}
	

}
