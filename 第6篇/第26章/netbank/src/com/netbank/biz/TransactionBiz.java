package com.netbank.biz;

import java.util.List;

import com.netbank.entity.*;



public interface TransactionBiz {

	//根據取得交易記錄
	public List getLogs(Account account,int page);

	//轉賬
	public boolean transfer(TransactionLog log);
	
	//存款
	public boolean deposit(TransactionLog log);
	
	//取款
	public boolean withdrawal(TransactionLog log);	
	
	//獲得賬戶的交易記錄總數,用來起始化分頁類別Pager物件,並設定其perPageRows和rowCount屬性	 
	public Pager getPagerOfLogs(Account account);
	
}