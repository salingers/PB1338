package com.ssh2test1.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh2test1.biz.UserBiz;
import com.ssh2test1.entity.Users;

public class UserManagerAction extends ActionSupport {
	//定義用於儲存使用者登入表單參數的兩個屬性
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
	//使用UserBiz宣告一個物件，並加入set方法用於相依植入
	UserBiz userBiz;	
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	//多載execute方法用來處理登入請求
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Users condition=new Users();
		condition.setLoginName(loginName);
		condition.setLoginPwd(loginPwd);		
		List list=userBiz.login(condition);
		if(list.size()>0){
			//登入成功，轉到success.jsp頁面
			return "success"; 
		}else{
			//登入失敗，轉到error.jsp頁面
			return "error";   
		}		
	}
}
