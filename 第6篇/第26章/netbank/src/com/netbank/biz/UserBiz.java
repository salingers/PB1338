package com.netbank.biz;

import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.netbank.entity.*;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
public interface UserBiz {

	/**
	 * 加入賬戶
	 * @param account
	 * @return
	 */
	public boolean addAccount(Account account);
	
	/**
	 * 移除賬戶
	 */
	public boolean delAccount(int id);

	/**
	 * 修改賬戶
	 * @param account
	 * @return
	 */
	public abstract boolean modifyAccount(Account account);
	
	
	/**
	 * 查詢賬戶
	 */
	public Account searchAccounts(final Account account);
	
	/**
	 * 根據賬戶id取得賬戶物件
	 * @param accountid
	 * @return
	 */
	@Transactional(readOnly = true)
	public abstract Account getAccount(int accountid);
	
	//根據賬戶名稱取得賬戶
	public abstract Account getAccount(String username);
	
	public List getAllAccounts();
	/**
	 * 啟用賬戶
	 */
	public void enabled(int id);
	/**
	 * 凍結賬戶
	 */
	public void locking(int id);
	
	//根據名稱取得賬戶狀態物件
	public Status getStatus(String name);
	
	public Status getStatus(int id);
	

	//修改管理員
	public boolean modifyAdmin(Admin admin);
	
	//根據username取得管理員
	public abstract Admin getAdmin(String username);

	public abstract void reflush(Account account);

}