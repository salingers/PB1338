package com.springtest1.dao;

public class UserDAOImpl implements UserDAO {

	public boolean login(String username, String password) {
		if(username.equals("admin") && password.equals("123")){
			return true;
		}
		return false;
	}

	public void addUser(String username, String password) {
		//�Ӯרҥ���{��Ʈw�ʧ@,�ٲ����p�{���X
		System.out.println(username+"�ϥΪ̥[�J���\");		
	}

	public void delUser(int id) {
		// TODO Auto-generated method stub
		//�Ӯרҥ���{��Ʈw�ʧ@
		System.out.println("�s����"+id+"���ϥΪ̳Q����");		
	}
}
