package com.ssh2test1.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh2test1.biz.UserBiz;

public class JsonValidateAction extends ActionSupport {
	//�ϥ�UserBiz�ŧi�@�Ӫ���A�å[�Jset��k�Ω�̪ۨ`
	private UserBiz userBiz;
	//�Ω�ʸ˨ϥΪ̦W�ٽШD�Ѽ�
	private String loginName;
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	//�Ω�ʸ˦��A���T�������ܰT��
	private String message;	
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}	
	//�ˬd�ϥΪ̦W�٬O�_�w�ϥ�
	public String execute() throws Exception {		
		if(userBiz.isExist(loginName)){
			setMessage("�藍�_�A�ӨϥΪ̤w�s�b�A�Э����@�ӡI");
		}else{
			setMessage("���ߧA�A"+loginName+" �A�ӨϥΪ̥i�H�ϥΡI");
		}
		return SUCCESS;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
