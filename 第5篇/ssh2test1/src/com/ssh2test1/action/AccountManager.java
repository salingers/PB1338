package com.ssh2test1.action;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh2test1.biz.AccountBiz;
import com.ssh2test1.entity.Account;

public class AccountManager extends ActionSupport {
	//定義屬性，用於封裝表單資料
	private String ac1;
	private String ac2;
	private String amount;
	public String getAc1() {
		return ac1;
	}
	public void setAc1(String ac1) {
		this.ac1 = ac1;
	}
	public String getAc2() {
		return ac2;
	}
	public void setAc2(String ac2) {
		this.ac2 = ac2;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	//使用AccountBiz接口宣告物件，並加入set方法用於相依植入
	AccountBiz accountBiz;	
	public void setAccountBiz(AccountBiz accountBiz) {
		this.accountBiz = accountBiz;
	}
	@Override
	//執行請求
	public String execute() throws Exception {
		Account a1=null;
		Account a2=null;
		//取得賬號ac1的賬戶物件，並更新物件中的賬戶余額屬性		
		List list1=accountBiz.getAccountByAccountNo(ac1);
		if(list1.size()>0){
			a1=(Account) list1.get(0);
			a1.setBalance(new Long(a1.getBalance().longValue()-Long.parseLong(amount)) );	
		}			
		//取得賬號ac2的賬戶物件，並更新物件中的賬戶余額屬性		
		List list2=accountBiz.getAccountByAccountNo(ac2);
		if(list2.size()>0){
			a2=(Account) list2.get(0);
			a2.setBalance(new Long(a2.getBalance().longValue()+Long.parseLong(amount)) );
		}		
		try {
			//執行轉賬動作
			accountBiz.transfer(a1, a2);
		} catch (Exception e) {
			// 轉賬失敗
			return "error1";
		}		
		//轉賬成功
		return "success1";
	}
}
