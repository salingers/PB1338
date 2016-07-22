package biz;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectBiz {
	Configuration configuration = null;
	SessionFactory sessionFactory = null;
	Session session = null;
	Transaction transaction = null;

	public boolean login(String name, String password) {

		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();

		Query query = session.createQuery("from User as u where u.nameuser ='"
				+ name + "' and u.passworduser = '" + password + "'");
		List list = query.list();
		if (list.size() < 1) {
			return false;
		} else {
			return true;
		}
	}
	public List getFriend(String name){
		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		
		Query query = session.createQuery("from Friend as f where f.username ='"
				+ name + "'");
		
		List list =query.list();
		return list;
	}
	
	public List getMessage(String name) {
		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		Query query = session.createQuery("from Message as m where m.username ='"+ name +"'order by m.messagetime desc");
		query.setFirstResult(0);
		query.setMaxResults(6);
		List list =query.list();
		return list;
	}
	
	public List getAllMessage(String name) {
		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		Query query = session.createQuery("from Message as m where m.username ='"+ name +"'order by m.messagetime desc");
		List list =query.list();
		return list;
	}
	
	public List getfriendinfo(String name) {
		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();

		Query query = session.createQuery("from User as u where u.nameuser ='"
				+ name + "'");
		
		List list =query.list();
		return list;
	}
	
	public List getAllUser(String name) {
		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		Query query = session.createQuery("from User as u where u.nameuser not in (select f.fname from Friend as f where f.username ='"+name+"') and u.nameuser != '"+name+"'");
		List list =query.list();
		return list;
	}

}
