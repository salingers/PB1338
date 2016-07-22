package com.netbank.dao;

import java.util.List;

import com.netbank.entity.*;


public interface TransactionDao {

	//向資料表transaction_log中加入記錄
	public boolean addLog(TransactionLog log);

	//取得交易記錄
	public List getLogs(final Account account,int page);
	
	//根據交易型態名稱取得交易型態物件
	public TransactionType getTransactionType(String name);
	
	//取得交易記錄數
	public Integer getCountOfLogs(Account account);
}