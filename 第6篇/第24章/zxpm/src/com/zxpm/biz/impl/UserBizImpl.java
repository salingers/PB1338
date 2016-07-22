package com.zxpm.biz.impl;

import java.util.Iterator;
import java.util.List;

import com.zxpm.biz.*;
import com.zxpm.dao.*;
import com.zxpm.entity.*;

public class UserBizImpl implements UserBiz {
    //�ϥ�UserDAO���f�ŧi����userDAO�A�å[�Jset��k�Ω�̴ۨӤJ
	private UserDAO userDAO;	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	//�n���ϥΪ�
	public void register(Users user) {
		userDAO.register(user);
	}
	
	//�ھڱ���d�ߨϥΪ�
	public Users getUsers(Users users) {
		Users user=null;
		List list=userDAO.search(users);
		Iterator iter=list.iterator();		
		if(iter.hasNext()){					
			user=(Users)iter.next();
		}
		return user;
	}
	
	//�ק�ϥΪ�
	public void updateUsers(Users users) {
		userDAO.update(users);		
	}
	public Users getUsersById(int userId) {
		Users user=userDAO.load(new Integer(userId));
		return user;
	}
}
