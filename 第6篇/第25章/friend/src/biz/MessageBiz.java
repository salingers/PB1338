package biz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.Message;

public class MessageBiz {
	Configuration configuration = null;
	SessionFactory sessionFactory = null;
	Session session = null;
	Transaction transaction = null;
	
	public MessageBiz(Message message){
		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		session.save(message);
		transaction.commit();
		session.close();
	}

}
