package com.springtest1.biz;

public interface UserBiz {
	public boolean login(String username,String password);
	//�[�J�ϥΪ�
	public void addUser(String username,String password);
	//�����ϥΪ�
	public void delUser(int id);
}
