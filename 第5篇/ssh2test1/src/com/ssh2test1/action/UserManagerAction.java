package com.ssh2test1.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh2test1.biz.UserBiz;
import com.ssh2test1.entity.Users;

public class UserManagerAction extends ActionSupport {
	//�w�q�Ω��x�s�ϥΪ̵n�J���Ѽƪ�����ݩ�
	private String loginName;
	private String loginPwd;
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	//�ϥ�UserBiz�ŧi�@�Ӫ���A�å[�Jset��k�Ω�̴ۨӤJ
	UserBiz userBiz;	
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	//�h��execute��k�ΨӳB�z�n�J�ШD
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Users condition=new Users();
		condition.setLoginName(loginName);
		condition.setLoginPwd(loginPwd);		
		List list=userBiz.login(condition);
		if(list.size()>0){
			//�n�J���\�A���success.jsp����
			return "success"; 
		}else{
			//�n�J���ѡA���error.jsp����
			return "error";   
		}		
	}
}
