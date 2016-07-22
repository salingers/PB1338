package com.netbank.biz.impl;

import java.util.List;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.netbank.biz.UserBiz;
import com.netbank.dao.UserDao;
import com.netbank.entity.*;
//使用@Transactional註釋實現交易管理
@Transactional
public class UserBizImpl implements UserBiz {
	//使用UserDao接口宣告物件，並加入set方法，用於相依植入
	UserDao userDao;	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	//修改賬戶
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED)
	public boolean modifyAccount(Account account) {
		return userDao.updateAccount(account);
	}
	
	//根據賬戶ID取得賬戶
	@Transactional(readOnly=true)
	public Account getAccount(int accountid) {
		return userDao.getAccount(accountid);
	}
	
	//根據username取得賬戶
	public Account getAccount(String username) {
		return userDao.getAccount(username);
	}
	
	//根據username取得管理員
	public Admin getAdmin(String username) {
		return userDao.getAdmin(username);
	}
	
	//獲得所有賬戶
	public List getAllAccounts() {
		return userDao.getAllAcconts();
	}
	
	//加入賬戶	
	public boolean addAccount(Account account) {
		Status status=userDao.getStatus("啟用");
		account.setStatus(status);
		return userDao.addAccount(account);
	}
	
	//修改管理員
	public boolean modifyAdmin(Admin admin) {
		return userDao.modifyAdmin(admin);
	}
	/**
	 * 移除使用者
	 */
	public boolean delAccount(int id) {
		//根據賬戶id取得賬戶
		Account account=userDao.getAccount(id);
		//移除賬戶物件，同時執行串聯移除
		return userDao.delAccount(account);
	}
	/**
	 * 查詢賬戶
	 */
	public Account searchAccounts(Account account) {
		return userDao.searchAccounts(account);
	}
	/**
	 * 取得狀態
	 */
	public Status getStatus(String name) {
		return userDao.getStatus(name);
	}

	public Status getStatus(int id) {
		return userDao.getStatus(id);
	}
	
	/**
	 * 啟用賬戶
	 */
	public void enabled(int id) {
		//根據賬戶編號取得賬戶物件
		Account account = userDao.getAccount(id);
		//修改賬戶物件的狀態屬性，設定為啟用
		Status status = userDao.getStatus("啟用");
		account.setStatus(status);
		//更新賬戶
		userDao.updateAccount(account);		
	}
	
	/**
	 * 凍結賬戶
	 */
	public void locking(int id) {
		//根據賬戶編號取得賬戶物件
		Account account = userDao.getAccount(id);
		//修改賬戶物件的狀態屬性，設定為凍結
		Status status = userDao.getStatus("凍結");		
		account.setStatus(status);
		//更新賬戶
		userDao.updateAccount(account);
		
	}

	public void reflush(Account account) {
		userDao.reflush(account);		
	}

}
