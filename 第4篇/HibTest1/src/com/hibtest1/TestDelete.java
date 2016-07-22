package com.hibtest1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibtest1.entity.Users;

public class TestDelete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestDelete().testDelete();
	}
	private void testDelete(){
		//�_�l��,Ū���պA��hibernate.cfg.xml
		Configuration config=new Configuration().configure();
		//Ū���øѪR�M�g�ɮ�(Users.hbm.xml)�A�إ�sessionFactory
		SessionFactory sessionFactory=config.buildSessionFactory();
		//�}��session
		Session session=sessionFactory.openSession();
		Transaction tx=null;
		//���J�n���������
		Users user=(Users)session.get(Users.class, new Integer(1));
		try {
			tx=session.beginTransaction();    //�}�l�@�ӥ��			
			session.delete(user);             //���沾��	
			tx.commit();                      //�ǰe���
		} catch (Exception e) {
			if(tx!=null){
				tx.rollback();       //�����^				
			}
			e.printStackTrace();
		}finally{
			session.close();   //����session
		}	
		
	}

}
