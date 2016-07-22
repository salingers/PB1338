package com.springtest1.dao;

public class UserDAOImpl implements UserDAO {

	public boolean login(String username, String password) {
		if(username.equals("admin") && password.equals("123")){
			return true;
		}
		return false;
	}

	public void addUser(String username, String password) {
		//該案例未實現資料庫動作,省略關聯程式碼
		System.out.println(username+"使用者加入成功");		
	}

	public void delUser(int id) {
		// TODO Auto-generated method stub
		//該案例未實現資料庫動作
		System.out.println("編號為"+id+"的使用者被移除");		
	}
}
