package com.zxpm.dao;

import java.util.List;

import com.zxpm.entity.Users;


public interface UserDAO {
	//登錄使用者
	public void register(Users user);
	//查詢使用者
	public List search(Users users);
	public Users load(Integer id);
	//修改使用者
	public void update(Users users);
}
