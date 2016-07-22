package com.zxpm.action;

import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.zxpm.biz.UserBiz;
import com.zxpm.entity.Users;

public class UserAction extends ActionSupport implements RequestAware,SessionAware {
    //使用UserBiz接口宣告屬性userBiz，並加入set方法，用於相依植入
	UserBiz userBiz;
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	Map<String, Object> request;
	Map<String, Object> session;	
	
	//定義Users類別物件，用於封裝表單參數
	private Users users;
	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}	
	
	/**
	 * 登錄
	 * @return
	 */
	public String addUser(){
		userBiz.register(users);
		return "success";
	}
	
	/**
	 * 登入
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
	 * 修改密碼
	 */
	public String changePwd(){
		Users user=(Users)session.get("user");
		user.setPassword(users.getPassword());
		session.put("user", user);
		userBiz.updateUsers(user);		
		return "success";		
	}
	
	/**
	 * 登出
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
