package com.ssh2test1.biz;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ssh2test1.dao.AccountDAO;
import com.ssh2test1.entity.Account;

//使用@Transactional註釋實現交易管理
@Transactional
public class AccountBizImpl implements AccountBiz {

	//用AccountDAO接口宣告物件，並加入set方法用於相依植入
	AccountDAO accountDAO;
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	//轉賬
	//使用@Transactional註釋實現transfer方法的交易管理
	@Transactional(propagation=Propagation.REQUIRED)	
	public void transfer(Account a1, Account a2) {
		accountDAO.transfer(a1, a2);
	}
	//根據賬號取得賬戶物件
	public List getAccountByAccountNo(String accountNo) {
		// TODO Auto-generated method stub
		return accountDAO.getAccountByAccountNo(accountNo);
	}

}
