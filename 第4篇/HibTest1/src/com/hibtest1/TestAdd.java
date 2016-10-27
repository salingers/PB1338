package com.hibtest1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibtest1.entity.Users;

public class TestAdd
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		new TestAdd().addUser();
	}

	private void addUser()
	{
		// �إ߫��[�ƪ���
		Users user = new Users();
		user.setLoginName("zhangsan");
		user.setLoginPwd("123456");
		// 1.�_�l��,Ū���պA��hibernate.cfg.xml
		Configuration config = new Configuration().configure();
		// 2.Ū���øѪR�M�g�ɮ�(Users.hbm.xml)�A�إ�sessionFactory
		SessionFactory sessionFactory = config.buildSessionFactory();
		// 3.�}��session
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try
		{
			tx = session.beginTransaction(); // 4.�}�l�@�ӥ��
			session.save(user); // 5.���[�ưʧ@
			tx.commit(); // 6.�ǰe���
		}
		catch (Exception e)
		{
			if (tx != null)
			{
				tx.rollback(); // �����^
			}
			e.printStackTrace();
		}
		finally
		{
			session.close(); // 7.����session
		}
	}
}
