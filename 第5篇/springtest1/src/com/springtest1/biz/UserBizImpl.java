package com.springtest1.biz;

import com.springtest1.dao.UserDAO;
import com.springtest1.dao.UserDAOImpl;

public class UserBizImpl implements UserBiz {
    //使用UserDAO接口宣告了一個物件，
	//並為其加入set方法，用於相依植入
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
		throw new RuntimeException("這是特意拋出的例外訊息！");
	}

}
