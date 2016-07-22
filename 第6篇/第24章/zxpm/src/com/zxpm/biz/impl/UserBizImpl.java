package com.zxpm.biz.impl;

import java.util.Iterator;
import java.util.List;

import com.zxpm.biz.*;
import com.zxpm.dao.*;
import com.zxpm.entity.*;

public class UserBizImpl implements UserBiz {
    //使用UserDAO接口宣告物件userDAO，並加入set方法用於相依植入
	private UserDAO userDAO;	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	//登錄使用者
	public void register(Users user) {
		userDAO.register(user);
	}
	
	//根據條件查詢使用者
	public Users getUsers(Users users) {
		Users user=null;
		List list=userDAO.search(users);
		Iterator iter=list.iterator();		
		if(iter.hasNext()){					
			user=(Users)iter.next();
		}
		return user;
	}
	
	//修改使用者
	public void updateUsers(Users users) {
		userDAO.update(users);		
	}
	public Users getUsersById(int userId) {
		Users user=userDAO.load(new Integer(userId));
		return user;
	}
}
