package com.ssh2test1.biz;

import java.util.List;

import com.ssh2test1.entity.Account;

public interface AccountBiz {
	//�ھڽ㸹���o��᪫��
	public List getAccountByAccountNo(String accountNo);
	//���
	public void transfer(Account a1,Account a2);	

}
