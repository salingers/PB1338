package com.zxpm.biz;

import com.zxpm.entity.Users;
public interface UserBiz {
	//�n���ϥΪ�
	public void register(Users user);
	
	//�ھڱ���d�ߨϥΪ�
	public Users getUsers(Users users);
	
	//�ק�ϥΪ�
	public void updateUsers(Users users);
	
	public Users getUsersById(int userId);
}
