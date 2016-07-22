package com.ssh2test1.action;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh2test1.biz.UserBiz;

public class RegAction extends ActionSupport {
	//定義用於封裝表單參數的屬性
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
	
	//檢查使用者名稱是否已使用
	public String doCheckUserExists() throws IOException{
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setCharacterEncoding("gbk");
		PrintWriter out=response.getWriter();
		boolean isEixist = userBiz.isExist(loginName);
		out.print(isEixist);
		return null;		
	}
	
	//登錄
	public String reg() throws IOException{
		//省略完成登錄的程式碼
		return null;		
	}
}
