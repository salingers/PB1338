package com.ssh2test1.action;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh2test1.biz.AccountBiz;
import com.ssh2test1.entity.Account;

public class AccountManager extends ActionSupport {
	//�w�q�ݩʡA�Ω�ʸ˪����
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
	//�ϥ�AccountBiz���f�ŧi����A�å[�Jset��k�Ω�̴ۨӤJ
	AccountBiz accountBiz;	
	public void setAccountBiz(AccountBiz accountBiz) {
		this.accountBiz = accountBiz;
	}
	@Override
	//����ШD
	public String execute() throws Exception {
		Account a1=null;
		Account a2=null;
		//���o�㸹ac1����᪫��A�ç�s���󤤪����E�B�ݩ�		
		List list1=accountBiz.getAccountByAccountNo(ac1);
		if(list1.size()>0){
			a1=(Account) list1.get(0);
			a1.setBalance(new Long(a1.getBalance().longValue()-Long.parseLong(amount)) );	
		}			
		//���o�㸹ac2����᪫��A�ç�s���󤤪����E�B�ݩ�		
		List list2=accountBiz.getAccountByAccountNo(ac2);
		if(list2.size()>0){
			a2=(Account) list2.get(0);
			a2.setBalance(new Long(a2.getBalance().longValue()+Long.parseLong(amount)) );
		}		
		try {
			//�������ʧ@
			accountBiz.transfer(a1, a2);
		} catch (Exception e) {
			// ��㥢��
			return "error1";
		}		
		//��㦨�\
		return "success1";
	}
}
