package com.springtest1.biz;

public interface UserBiz {
	public boolean login(String username,String password);
	//加入使用者
	public void addUser(String username,String password);
	//移除使用者
	public void delUser(int id);
}
