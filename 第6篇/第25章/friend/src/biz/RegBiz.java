package biz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.User;



public class RegBiz {
	Configuration configuration = null;
	SessionFactory sessionFactory = null;
	Session session = null;
	Transaction transaction = null;
	
	public RegBiz(User user){
		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
	}

}
