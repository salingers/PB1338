package com.netbank.biz.impl;

import java.util.ArrayList;
import java.util.List;
import com.netbank.biz.*;
import com.netbank.dao.*;
import com.netbank.entity.*;

public class PersoninfoBizImpl implements PersoninfoBiz {
	//使用PersoninfoDao接口定義物件，並加入set方法用於相依植入
	PersoninfoDao personinfoDao;
	public void setPersoninfoDao(PersoninfoDao personinfoDao) {
		this.personinfoDao = personinfoDao;
	}
	//使用UserDao接口定義物件，並加入set方法用於相依植入
	UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	/**
	 * 修改個人訊息
	 */
	public boolean modifyPersoninfo(Personinfo personinfo) {
		personinfoDao.modifyPersoninfo(personinfo);
		return true;
	}
	
	/**
	 * 加入個人訊息
	 */
	public boolean add(Personinfo personinfo) {
		return personinfoDao.add(personinfo);
	}
	
	/**
	 * 查詢個人訊息
	 */
	public List getAllPersoninfo() {
		return personinfoDao.getAllPersoninfo();
	}
	
	/**
	 * 根據條件取得個人訊息
	 */
	public List searchPersoninfo(Personinfo personinfo) {
		return personinfoDao.searchPersoninfo(personinfo);
	}
	
	/**
	 * 根據賬戶狀態取得個人訊息，狀態為0表示取得所有客戶
	 */
	public List searchPersoninfo(Status status)
	{
		List users =new ArrayList();
		if(status.getId()!=0){		
			//若果賬戶狀態編號不為0，則根據編號取得對應客戶記錄
			status=userDao.getStatus(status.getId());
			users=personinfoDao.searchPersoninfo(status);
		}else{
			//若果賬戶狀態編號等於0，則取得所有客戶記錄
			users= personinfoDao.getAllPersoninfo();
		}
		return users;
	}
}
