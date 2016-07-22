package com.netbank.action;

import java.util.Map;
import javax.annotation.Resource;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.netbank.biz.UserBiz;
import com.netbank.entity.*;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport implements RequestAware,SessionAware {
	//定義透過@Resource註釋植入的屬性userBiz，可省略set方法
	@Resource private UserBiz userBiz;
	Map<String, Object> request;
	Map<String, Object> session;
	//定義Account型態物件，用於封裝登入表單參數
	private Account account;
	private Personinfo personinfo;
	private Password pwd;
	
	public String logout(){
		session.remove("user");
		session.remove("personinfo");
		return "success";
	}
	

	/**
	 * 執行頁面客戶登入請求
	 * @return
	 */
	public String login(){
		//根據關聯關系，從賬戶物件中取得個人訊息物件
		personinfo=(Personinfo) account.getPersoninfos().iterator().next();
		//將賬戶物件存入session
		session.put("user", account);
		//將該賬戶個人訊息物件存入session
		session.put("personinfo",personinfo);
		//頁面轉信
		return "success";
	}
	
	/**
	 * 執行修改密碼請求
	 * @return
	 */
	public String changepwd(){
			account.setPassword(pwd.getNewpwd());
			if(userBiz.modifyAccount(account)){
				session.put("user", account);
				request.put("message", "密碼修改成功！");
				return "message";
			}
			request.put("message", "密碼修改失敗！");
			return "message";
		
	}
	
	/**
	 * 修改密碼頁面驗證
	 */
	public void validateChangepwd(){
		account=(Account) session.get("user");
		if(!pwd.getOldpwd().equals(account.getPassword())){
			this.addFieldError("pwd.oldpwd", "密碼不正確");
		}
		if(!pwd.getNewpwd().equals(pwd.getConfirmpwd())){
			this.addFieldError("pwd.confirmpwd", "兩次密碼不一致");
		}
	}
	
	/**
	 * 登入表單驗證，並實現根據使用者名稱取得賬戶物件
	 */
	public void validateLogin(){
		Account a = userBiz.getAccount(account.getUsername());
		if(a==null){
			this.addFieldError("username", "使用者名稱不存在");
		}else{
			if(!account.getPassword().equals(a.getPassword())){
				this.addFieldError("password", "密碼不正確");
			}
		}
		account=a;		
	}

	public Personinfo getPersoninfo() {
		return personinfo;
	}
	public void setPersoninfo(Personinfo personinfo) {
		this.personinfo = personinfo;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Password getPwd() {
		return pwd;
	}

	public void setPwd(Password pwd) {
		this.pwd = pwd;
	}

	public void setRequest(Map<String, Object> request) {
		this.request=request;
	}

	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

}
