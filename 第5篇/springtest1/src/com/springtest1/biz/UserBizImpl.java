package com.springtest1.biz;

import com.springtest1.dao.UserDAO;
import com.springtest1.dao.UserDAOImpl;

public class UserBizImpl implements UserBiz {
    //�ϥ�UserDAO���f�ŧi�F�@�Ӫ���A
	//�ì���[�Jset��k�A�Ω�̴ۨӤJ
	UserDAO userDAO;	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return userDAO.login(username, password);
	}
	public void addUser(String username, String password) {
		userDAO.addUser(username, password);
		
	}
	public void delUser(int id) {
		userDAO.delUser(id);	
		throw new RuntimeException("�o�O�S�N�ߥX���ҥ~�T���I");
	}

}
