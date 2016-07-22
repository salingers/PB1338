package action;

import biz.RegBiz;

import com.opensymphony.xwork2.ActionSupport;

import dao.User;

public class RegAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Integer iduser;
	private String nameuser;
	private Integer ageuser;
	private String sexuser;
	private String emailuser;
	private String passworduser;

	public Integer getIduser() {
		return iduser;
	}

	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}

	public String getNameuser() {
		return nameuser;
	}

	public void setNameuser(String nameuser) {
		this.nameuser = nameuser;
	}

	public Integer getAgeuser() {
		return ageuser;
	}

	public void setAgeuser(Integer ageuser) {
		this.ageuser = ageuser;
	}

	public String getSexuser() {
		return sexuser;
	}

	public void setSexuser(String sexuser) {
		this.sexuser = sexuser;
	}

	public String getEmailuser() {
		return emailuser;
	}

	public void setEmailuser(String emailuser) {
		this.emailuser = emailuser;
	}

	public String getPassworduser() {
		return passworduser;
	}

	public void setPassworduser(String passworduser) {
		this.passworduser = passworduser;
	}

	@Override
	public String execute() throws Exception {
		User user = new User();
		user.setNameuser(this.getNameuser());
		user.setPassworduser(this.getPassworduser());
		user.setAgeuser(this.getAgeuser());
		user.setSexuser(this.getSexuser());
		user.setEmailuser(this.getEmailuser());
		
		new RegBiz(user);
		return SUCCESS;
	}

}
