package com.zxpm.action;

import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.zxpm.biz.UserBiz;
import com.zxpm.entity.Users;

public class UserAction extends ActionSupport implements RequestAware,SessionAware {
    //�ϥ�UserBiz���f�ŧi�ݩ�userBiz�A�å[�Jset��k�A�Ω�̴ۨӤJ
	UserBiz userBiz;
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	Map<String, Object> request;
	Map<String, Object> session;	
	
	//�w�qUsers���O����A�Ω�ʸ˪��Ѽ�
	private Users users;
	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}	
	
	/**
	 * �n��
	 * @return
	 */
	public String addUser(){
		userBiz.register(users);
		return "success";
	}
	
	/**
	 * �n�J
	 * @return
	 */
	public String login(){
		Users u=userBiz.getUsers(users);
		if(u!=null){
			session.put("user", u);
		}
		return "index";
	}
	
	/**
	 * �ק�K�X
	 */
	public String changePwd(){
		Users user=(Users)session.get("user");
		user.setPassword(users.getPassword());
		session.put("user", user);
		userBiz.updateUsers(user);		
		return "success";		
	}
	
	/**
	 * �n�X
	 */
	public String loginout(){
		if(session.get("user")!=null){
    		session.remove("user");    		
    	}
		return "index";		
	}

	public void setRequest(Map<String, Object> request) {
		this.request=request;		
	}

	public void setSession(Map<String, Object> session) {
		this.session=session;		
	}
}
