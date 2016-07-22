package com.netbank.action;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.netbank.biz.*;
import com.netbank.entity.*;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport implements RequestAware,
		SessionAware {
	//定義透過@Resource註釋植入的屬性userBiz，可省略set方法
	@Resource private UserBiz userBiz;
	//定義透過@Resource註釋植入的屬性personinfoBiz，可省略set方法
	@Resource private PersoninfoBiz personinfoBiz;
	Map<String, Object> request;
	Map<String, Object> session;
	//定義Admin型態物件，用於封裝管理員登入等頁面的表單參數
	private Admin admin;	
	private Account account;
	//定義Personinfo型態物件，用於封裝頁面表單參數
	private Personinfo personinfo;
	private Password pwd;
	private int id;
	private Status status;
	
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * 對登入頁面進行驗證，檢查使用者名稱和密碼是否正確
	 */
	public void validateLogin(){
		//呼叫業務方法，根據username取得管理員
		Admin a=userBiz.getAdmin(admin.getUsername());
		if(a==null){
			this.addFieldError("username", "使用者名稱不存在");
		}else{
			if(!admin.getPassword().equals(a.getPassword())){
				this.addFieldError("password", "密碼不正確");
			}
			admin=a;
		}
	}	
	/**
	 * 登入
	 * @return
	 */
	public String login(){
		
		if(admin!=null){
			session.put("admin",admin);
			return "success";
		}
		return "login";
	}
	
	/**
	 * 查詢賬戶
	 * @return
	 */
	public String listUsers(){
		//呼叫業務方法，根據賬戶狀態取得個人訊息，狀態為0表示取得所有客戶
		List users=personinfoBiz.searchPersoninfo(status);
		request.put("users",users);
		return "users";
		
	}
	
	//登出
	public String logout(){
		session.remove("admin");
		return "login";
	}
	
	/**
	 * 對開戶頁面進行驗證，驗證使用者名稱是否已存在、一張身份證只能擁有一個賬戶
	 */
	public void validateKaihu(){
		if(userBiz.getAccount(account.getUsername())!=null){
			request.put("message", "使用者名稱已存在");
		}
		//取得滿足條件的個人訊息，這裡的條件為開戶頁面中填寫的身份證號
		List list = personinfoBiz.searchPersoninfo(personinfo);
		//若果所填寫的身份證號在個人訊息中已存在，則提示錯誤訊息
		if(list.size()>0){
			this.addFieldError("personinfo.cardid", "一張身份證只能擁有一個賬戶");
		}		
	}	
	//開戶
	public String kaihu(){
	    //呼叫業務方法，向賬戶表Account中加入賬戶
		userBiz.addAccount(account);
		//呼叫業務方法，向個人訊息表personinfo加入個人訊息
		account = userBiz.getAccount(account.getUsername());
		personinfo.setAccount(account);
		personinfoBiz.add(personinfo);
		request.put("message", "加入成功");
		return "message";		
	}
	
	/**
	 * 對修改密碼頁面進行驗證
	 */
	public void validateChangepwd(){
		admin=(Admin)session.get("admin");
		if(!pwd.getOldpwd().equals(admin.getPassword())){
			this.addFieldError("pwd.oldpwd", "密碼不正確");
		}
		if(!pwd.getNewpwd().equals(pwd.getConfirmpwd())){
			this.addFieldError("pwd.confirmpwd", "兩次密碼不一致");
		}
	}	
	//修改密碼
	public String changepwd(){
		admin.setPassword(pwd.getNewpwd());
		if(userBiz.modifyAdmin(admin)){
			session.put("admin",admin);
			request.put("message", "密碼修改成功！");
			return "message";
		}
		request.put("message", "密碼修改失敗！");
		return "message";
	}
	
	/**
	 * 移除賬戶
	 */	
	public String del(){
		//呼叫業務方法，移除賬戶，同時進行串聯移除
		userBiz.delAccount(id);
		return "list";
	}
	/**
	 * 查詢賬戶
	 */	
	public String search(){
		List users=personinfoBiz.searchPersoninfo(personinfo);
		request.put("users",users);
		return "users";
	}
	/**
	 * 啟用賬戶
	 * @return
	 */
	public String enabled(){
		userBiz.enabled(id);
		return "list";
	}
	/**
	 * 凍結賬戶
	 * @return
	 */
	public String locking(){
		userBiz.locking(id);
		return "list";
	}	
	
	
	
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Personinfo getPersoninfo() {
		return personinfo;
	}
	public void setPersoninfo(Personinfo personinfo) {
		this.personinfo = personinfo;
	}
	public Password getPwd() {
		return pwd;
	}
	public void setPwd(Password pwd) {
		this.pwd = pwd;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public void setRequest(Map<String, Object> request) {
		this.request=request;
	}

	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

}
