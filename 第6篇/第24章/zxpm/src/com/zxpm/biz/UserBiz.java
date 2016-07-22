package com.zxpm.biz;

import com.zxpm.entity.Users;
public interface UserBiz {
	//登錄使用者
	public void register(Users user);
	
	//根據條件查詢使用者
	public Users getUsers(Users users);
	
	//修改使用者
	public void updateUsers(Users users);
	
	public Users getUsersById(int userId);
}
