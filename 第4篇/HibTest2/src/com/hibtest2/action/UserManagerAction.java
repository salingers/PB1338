package com.hibtest2.action;

import com.hibtest2.biz.UserBiz;
import com.hibtest2.biz.UserBizImpl;
import com.hibtest2.dao.UserDAO;
import com.hibtest2.dao.UserDAOImpl;
import com.hibtest2.entity.Users;
import com.opensymphony.xwork2.ActionSupport;

public class UserManagerAction extends ActionSupport {
	
	//�w�q�Ω��x�s�ϥΪ̵n�J���Ѽƪ�����ݩ�
	private String loginName;
	private String loginPwd;
	//�ݩʪ�get�Mset��k
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
    
	//�h��execute��k�ΨӳB�z�n�J�ШD
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Users condition=new Users();
		condition.setLoginName(loginName);
		condition.setLoginPwd(loginPwd);
		UserBiz userBiz=new UserBizImpl();
		boolean flag=userBiz.checkLogin(loginName, loginPwd);
		if(flag){
			//�n�J���\�A���success.jsp����
			return "success"; 
		}else{
			//�n�J���ѡA���error.jsp����
			return "error";   
		}		
	}
}
