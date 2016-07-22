package com.hibtest2.dao;

import java.util.List;

import com.hibtest2.entity.Users;

public class UserDAOImpl extends BaseHibernateDAO implements UserDAO {
	//�[�J���
	public void add(Users users) {
		super.add(users);
	}
	//�������
	public void delete(Users users) {
		super.delete(users);
	}
	//���J���
	public Users load(Integer id) {
		return (Users)super.get(Users.class, id);
	}
	//�ק���
	public void update(Users users) {
		super.update(users);
	}
	//�n�J����
	public boolean validate(String loginName, String loginPwd) {
		// TODO Auto-generated method stub
		boolean flag=false;
		//�ʸˬd�߱���
		Users condition=new Users();
		condition.setLoginName(loginName);
		condition.setLoginPwd(loginPwd);
		//�I�sBaseHibernateDAO���O����search��k
		List list=super.search(Users.class, condition);
		if(list.size()>0){
			flag=true; 
		}
		return flag;
	}

}
