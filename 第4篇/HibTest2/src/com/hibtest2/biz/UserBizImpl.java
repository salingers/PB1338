package com.hibtest2.biz;

import com.hibtest2.dao.UserDAO;
import com.hibtest2.dao.UserDAOImpl;

public class UserBizImpl implements UserBiz {

	UserDAO userDAO= new UserDAOImpl();
	public boolean checkLogin(String loginName, String loginPwd) {
		// TODO Auto-generated method stub
		return userDAO.validate(loginName, loginPwd);
	}
	
}
