package com.springtest1.dao;

public interface UserDAO {
	public boolean login(String username,String password);
	//�[�J�ϥΪ�
	public void addUser(String username,String password);
	//�����ϥΪ�
	public void delUser(int id);
}
