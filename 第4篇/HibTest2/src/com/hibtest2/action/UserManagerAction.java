package com.hibtest2.action;

import com.hibtest2.biz.UserBiz;
import com.hibtest2.biz.UserBizImpl;
import com.hibtest2.dao.UserDAO;
import com.hibtest2.dao.UserDAOImpl;
import com.hibtest2.entity.Users;
import com.opensymphony.xwork2.ActionSupport;

public class UserManagerAction extends ActionSupport {
	
	//定義用於儲存使用者登入表單參數的兩個屬性
	private String loginName;
	private String loginPwd;
	//屬性的get和set方法
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
    
	//多載execute方法用來處理登入請求
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Users condition=new Users();
		condition.setLoginName(loginName);
		condition.setLoginPwd(loginPwd);
		UserBiz userBiz=new UserBizImpl();
		boolean flag=userBiz.checkLogin(loginName, loginPwd);
		if(flag){
			//登入成功，轉到success.jsp頁面
			return "success"; 
		}else{
			//登入失敗，轉到error.jsp頁面
			return "error";   
		}		
	}
}
