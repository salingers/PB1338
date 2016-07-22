package com.hibtest2.dao;

import java.util.List;

import com.hibtest2.entity.Users;

public class UserDAOImpl extends BaseHibernateDAO implements UserDAO {
	//加入資料
	public void add(Users users) {
		super.add(users);
	}
	//移除資料
	public void delete(Users users) {
		super.delete(users);
	}
	//載入資料
	public Users load(Integer id) {
		return (Users)super.get(Users.class, id);
	}
	//修改資料
	public void update(Users users) {
		super.update(users);
	}
	//登入驗證
	public boolean validate(String loginName, String loginPwd) {
		// TODO Auto-generated method stub
		boolean flag=false;
		//封裝查詢條件
		Users condition=new Users();
		condition.setLoginName(loginName);
		condition.setLoginPwd(loginPwd);
		//呼叫BaseHibernateDAO類別中的search方法
		List list=super.search(Users.class, condition);
		if(list.size()>0){
			flag=true; 
		}
		return flag;
	}

}
