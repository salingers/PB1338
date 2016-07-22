package com.netbank.biz.impl;

import java.util.List;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.netbank.biz.*;
import com.netbank.dao.*;
import com.netbank.entity.*;

public class TransactionBizImpl implements TransactionBiz {
	//使用TransactionDao接口宣告屬性，並加入set方法用於相依植入
	private TransactionDao transactionDao;
	public void setTransactionDao(TransactionDao transactionDao) {
		this.transactionDao = transactionDao;
	}
	
	//使用UserDao接口宣告屬性，並加入set方法用於相依植入
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	/**
	 * 取得交易記錄
	 */
	public List getLogs(Account account,int page) {		
		return transactionDao.getLogs(account,page);
	}
	
	/**
	 * 轉賬
	 */	
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED)
	public boolean transfer(TransactionLog log) {
		//取得入賬方賬戶物件
		Account other=userDao.getAccount(log.getOtherid());
		//取得轉賬方賬戶物件
		Account self=log.getAccount();
		if(other!=null){
			//修改轉賬方賬戶余額
			self.setBalance(log.getAccount().getBalance()-log.getTrMoney());
			//修改入賬方賬戶余額
			other.setBalance(other.getBalance()+log.getTrMoney());
			//將轉賬方賬戶余額更新到資料表Account
			userDao.updateAccount(self);
			//將入賬方賬戶余額更新到資料表Account
			userDao.updateAccount(other);
			//根據交易型態取得交易型態物件
			TransactionType type = transactionDao.getTransactionType("轉賬");
			log.setTransactionType(type);
			//向資料表transaction_log中加入交易記錄
			return  transactionDao.addLog(log);
		}
		return false;		
	}
	
	/**
	 * 存款
	 */
	public boolean deposit(TransactionLog log) {
		//從交易訊息物件log中取出賬戶物件
		Account self=log.getAccount();
		//將賬戶余額與存款金額相加
		self.setBalance(log.getAccount().getBalance()+log.getTrMoney());
		//更新賬戶表Account，修改賬戶余額
		userDao.updateAccount(self);
		//根據交易型態取得交易型態物件
		TransactionType type = transactionDao.getTransactionType("存款");
		log.setTransactionType(type);
		log.setOtherid(self.getAccountid());
		//向資料表transaction_log中加入交易記錄
		return transactionDao.addLog(log);
	}
	
	/**
	 * 取款
	 */
	public boolean withdrawal(TransactionLog log){
		//從交易訊息物件log中取出賬戶物件
		Account self=log.getAccount();
		//將賬戶余額與取款金額相減
		self.setBalance(log.getAccount().getBalance()-log.getTrMoney());
		//更新賬戶表Account，修改賬戶余額
		userDao.updateAccount(self);
		//根據交易型態取得交易型態物件
		TransactionType type = transactionDao.getTransactionType("取款");
		log.setTransactionType(type);
		log.setOtherid(self.getAccountid());
		//向資料表transaction_log中加入交易記錄
		return transactionDao.addLog(log);
	}
	
	/**
	 * 獲得賬戶的交易記錄總數，用來起始化分頁類別Pager物件，
	 * 並設定其perPageRows和rowCount屬性
	 */
	public Pager getPagerOfLogs(Account account) {
		//從資料表Transaction_Log中取得與賬戶關聯的交易記錄數
		int count=transactionDao.getCountOfLogs(account);
		//使用分頁類別Pager定義物件
		Pager pager=new Pager();
		//設定pager物件中的perPageRows屬性，表示每頁顯示的記錄數
		pager.setPerPageRows(10);
		//設定pager物件中的rowCount屬性，表示記錄總數
		pager.setRowCount(count);
	    //傳回pager物件
		return pager;
	}
	
	public TransactionDao getTransactionDao() {
		return transactionDao;
	}
	
	public UserDao getUserDao() {
		return userDao;
	}
	
}
