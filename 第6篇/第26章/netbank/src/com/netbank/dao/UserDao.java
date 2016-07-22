package com.netbank.dao;

import java.util.List;

import com.netbank.entity.*;


public interface UserDao {

	//根據賬戶id取得賬戶物件
	public  Account getAccount(int accountid);
	
	//根據客戶名取得客戶物件
	public Account getAccount(String username);
	
	public List getAllAcconts();
	
	public Account searchAccounts(final Account account);
	
	//修改賬戶
	public boolean updateAccount(Account account);
	
	//加入賬戶
	public boolean addAccount(Account account);
	
	//移除賬戶
	public boolean delAccount(Account account);
	

	public void reflush(Account account);
	
	//根據賬戶狀態名稱取得賬戶狀態物件
	public Status getStatus(String name);
	
	public Status getStatus(int id);
	
	//根據username取得管理員
	public Admin getAdmin(String username);
	
	
	public boolean modifyAdmin(Admin admin);
}