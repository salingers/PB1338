package com.zxpm.dao;

import java.util.List;

import com.zxpm.entity.Users;


public interface UserDAO {
	//�n���ϥΪ�
	public void register(Users user);
	//�d�ߨϥΪ�
	public List search(Users users);
	public Users load(Integer id);
	//�ק�ϥΪ�
	public void update(Users users);
}
