package com.ssh2test1.biz;

import java.util.List;

import com.ssh2test1.entity.Account;

public interface AccountBiz {
	//根據賬號取得賬戶物件
	public List getAccountByAccountNo(String accountNo);
	//轉賬
	public void transfer(Account a1,Account a2);	

}
