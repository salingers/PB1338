package com.netbank.action;

import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.netbank.biz.*;
import com.netbank.entity.*;
import com.opensymphony.xwork2.ActionSupport;

public class Transaction extends ActionSupport implements RequestAware,SessionAware {
	//使用UserBiz接口宣告屬性並加入set方法用於相依植入
	private UserBiz userBiz;
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	//使用transactionBiz接口宣告屬性並加入set方法用於相依植入
	private TransactionBiz transactionBiz;
	public void setTransactionBiz(TransactionBiz transactionBiz) {
		this.transactionBiz = transactionBiz;
	}	
	private Map<String, Object> request;
	private Map<String, Object> session;
	//宣告Account型態屬性
	private Account account;
	//定義TransactionLog物件並加入get和set方法，用於封裝頁面表單參數
	private TransactionLog log;
	public TransactionLog getLog() {
		return log;
	}
	public void setLog(TransactionLog log) {
		this.log = log;
	}
	//分頁實體類別
	private Pager pager;
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	
	/**
	 * 顯示交易記錄
	 * @return
	 */	
	public String list(){
		//取得待顯示頁頁碼
		int curPage=pager.getCurPage();
		//根據待顯示頁頁碼和賬戶物件取得交易記錄
		List<TransactionLog> logs = transactionBiz.getLogs(account,curPage);		
		//獲得賬戶的交易記錄總數，用來起始化分頁類別Pager物件，並設定其perPageRows和rowCount屬性
		pager=transactionBiz.getPagerOfLogs(account);
		//設定Pager物件中的待顯示頁頁碼
		pager.setCurPage(curPage);
		request.put("logs", logs);
		return "success";
	}
	
	/**
	 * 轉賬
	 * @return
	 */
	public String transfer(){
		//呼叫自訂方法isEnable判斷賬戶是否凍結
		if(isEnable()){
			//使用執行isEnable方法從session中重新取得的賬戶物件，給交易訊息物件log中關聯的賬戶物件屬性給予值
			log.setAccount(account);
			session.put("user", account);
			//呼叫業務方法，更新轉賬方和入賬方的賬戶表Accout中的余額，並在交易訊息表transaction_log中加入記錄
			return isSuccess(transactionBiz.transfer(log));
		}
		return "message";		
	}
	
	/***
	 * 存款
	 * @return
	 */
	public String deposit(){
		//呼叫自訂方法isEnable判斷賬戶是否凍結
		if(isEnable()){
			//使用執行isEnable方法從session中重新取得的賬戶物件，給交易訊息物件log中關聯的賬戶物件屬性給予值
			log.setAccount(account);
			session.put("user", account);
			//呼叫業務方法，更新賬戶表Accout中的余額，並在交易訊息表transaction_log中加入記錄
			return isSuccess(transactionBiz.deposit(log));
		}
		return "message";
	}
	
	/**
	 * 取款
	 * @return
	 */
	public String withdrawal(){
		////呼叫自訂方法isEnable判斷賬戶是否凍結
		if(isEnable()){
			//使用執行isEnable方法從session中重新取得的賬戶物件，給交易訊息物件log中關聯的賬戶物件屬性給予值
			log.setAccount(account);
			session.put("user", account);
			//呼叫業務方法，更新賬戶表Accout中的余額，並在交易訊息表transaction_log中加入記錄
			return isSuccess(transactionBiz.withdrawal(log));
		}
		return "message";
	}
	
	/**
	 * 判斷賬戶是否凍結
	 * @return
	 */
	private boolean isEnable(){
		//從session中重新取得Account物件，該物件在登入成功時已儲存到session中
		userBiz.reflush(account);
		if(account.getStatus().getName().equals("凍結")){
			request.put("message", "對不起！該賬戶也被凍結,無法進行關聯動作<br>");
			return false;
		}
		return true;
	}
	
	//根據執行結果，顯示動作成功或失敗訊息
	private String isSuccess(boolean flag){
			if(flag)
			{ 
				request.put("message","動作成功！");
				return "message";
			}
			request.put("message","動作失敗！<a href='javascript:history.go(-1)'>傳回</a>");
			return "message";
		
	}
	
	@Override
	public void validate() {
		super.validate();
	}
	
	/**
	 * 取款頁面驗證，用於判斷賬戶余額是否充足
	 */
	public void validateWithdrawal(){
		//比較取款頁面輸入的金額與賬戶余額
		if(log.getTrMoney()>account.getBalance()){
			this.addFieldError("log.trMoney","您的賬戶余額不足！");
		}
	}
	
	/**
	 * 轉賬頁面驗證，判斷是否給本人賬戶轉賬、入賬賬戶是否存在及轉賬賬戶余額是否充足
	 */
	public void validateTransfer(){
		if(log.getOtherid().intValue()==account.getAccountid().intValue()){
			this.addFieldError("log.otherid","您不能轉賬給自己！");
		}
		if(userBiz.getAccount(log.getOtherid())==null){
			this.addFieldError("log.otherid","該賬戶不存在！");
		}
		if(log.getTrMoney()>account.getBalance()){
			this.addFieldError("log.trMoney","您的賬戶余額不足！");
		}
	}
	public void setRequest(Map<String, Object> request) {
		this.request=request;
	}

	public void setSession(Map<String, Object> session) {
		this.session=session;
		account=(Account)session.get("user");
	}
	public TransactionBiz getTransactionBiz() {
		return transactionBiz;
	}	
	public UserBiz getUserBiz() {
		return userBiz;
	}

}
