package com.hibtest1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibtest1.entity.Users;

public class TestLoad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestLoad().testLoad();
	}
	
	private void testLoad(){
		//1.�_�l��,Ū���պA��hibernate.cfg.xml
		Configuration config=new Configuration().configure();
		//2.Ū���øѪR�M�g�ɮ�(Users.hbm.xml)�A�إ�sessionFactory
		SessionFactory sessionFactory=config.buildSessionFactory();
		//3.�}��session
		Session session=sessionFactory.openSession();
		//4.���J���
		Users user=(Users)session.get(Users.class, new Integer(1));
		//�b�D���x��X�ϥΪ̦W�٩M�K�X
		System.out.println(user.getLoginName()+" "+user.getLoginPwd());
	}

}
