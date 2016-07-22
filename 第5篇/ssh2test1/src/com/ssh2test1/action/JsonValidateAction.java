package com.ssh2test1.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh2test1.biz.UserBiz;

public class JsonValidateAction extends ActionSupport {
	//使用UserBiz宣告一個物件，並加入set方法用於相依注
	private UserBiz userBiz;
	//用於封裝使用者名稱請求參數
	private String loginName;
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	//用於封裝伺服器響應的提示訊息
	private String message;	
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}	
	//檢查使用者名稱是否已使用
	public String execute() throws Exception {		
		if(userBiz.isExist(loginName)){
			setMessage("對不起，該使用者已存在，請重換一個！");
		}else{
			setMessage("恭喜你，"+loginName+" ，該使用者可以使用！");
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
