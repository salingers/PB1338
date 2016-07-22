package com.ssh2test1.biz;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ssh2test1.dao.AccountDAO;
import com.ssh2test1.entity.Account;

//�ϥ�@Transactional������{����޲z
@Transactional
public class AccountBizImpl implements AccountBiz {

	//��AccountDAO���f�ŧi����A�å[�Jset��k�Ω�̴ۨӤJ
	AccountDAO accountDAO;
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	//���
	//�ϥ�@Transactional������{transfer��k������޲z
	@Transactional(propagation=Propagation.REQUIRED)	
	public void transfer(Account a1, Account a2) {
		accountDAO.transfer(a1, a2);
	}
	//�ھڽ㸹���o��᪫��
	public List getAccountByAccountNo(String accountNo) {
		// TODO Auto-generated method stub
		return accountDAO.getAccountByAccountNo(accountNo);
	}

}
