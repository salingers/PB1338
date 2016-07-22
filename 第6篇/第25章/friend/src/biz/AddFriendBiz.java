package biz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.Friend;

public class AddFriendBiz {
	Configuration configuration = null;
	SessionFactory sessionFactory = null;
	Session session = null;
	Transaction transaction = null;
	
	public AddFriendBiz(Friend	friend){
		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		session.save(friend);
		transaction.commit();
		session.close();
	}

}