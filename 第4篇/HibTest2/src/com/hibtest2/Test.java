package com.hibtest2;
import com.hibtest2.dao.UserDAO;
import com.hibtest2.dao.UserDAOImpl;
import com.hibtest2.entity.Users;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test test=new Test();
		//�̦�����testAdd�BtestDelete�MtestUpdate��k
		//test.testAdd();
		//test.testDelete(new Integer(9));		
		test.testUpdate();
	}
	//�[�J���
	public void testAdd(){
		Users users=new Users();
		users.setLoginName("New York");
		users.setLoginPwd("123456");	
		UserDAO userDao=new UserDAOImpl();
		userDao.add(users);		
	}	
	//�������
	public void testDelete(Integer id){
		UserDAO userDao=new UserDAOImpl();
		Users users=userDao.load(id);
		userDao.delete(users);
	}
	//�ק���
	public void testUpdate(){
		UserDAO userDao=new UserDAOImpl();
		Users users=userDao.load(new Integer(2));	
		users.setLoginPwd("210000");
		userDao.update(users);
	}

}
