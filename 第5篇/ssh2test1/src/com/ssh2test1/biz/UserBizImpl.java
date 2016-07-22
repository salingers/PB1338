package com.ssh2test1.biz;

import java.util.List;

import com.ssh2test1.dao.UserDAO;
import com.ssh2test1.entity.Users;

public class UserBizImpl implements UserBiz {

	//使用UserDAO接口宣告物件，並加入set方法用於相依植入
	UserDAO userDAO;	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public List login(Users condition) {
		// TODO Auto-generated method stub
		return userDAO.search(condition);
	}
	public boolean isExist(String username) {	
		boolean bExist = false;
		//封裝查詢條件
		Users condition = new Users();
		condition.setLoginName(username); 
		//執行查詢
		List list = userDAO.search(condition);
		if (list==null || list.size()==0){
			//若果沒有找到比對記錄，則傳回false
			bExist = false;
		}else{
			bExist = true;
		}
		return bExist;

	}	
}
