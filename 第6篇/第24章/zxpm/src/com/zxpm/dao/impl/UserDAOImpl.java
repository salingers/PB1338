package com.zxpm.dao.impl;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.zxpm.dao.*;
import com.zxpm.entity.*;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	//登錄使用者
	public void register(Users user) {
		super.getHibernateTemplate().save(user);
	}
	
	//查詢使用者
	public List search(final Users users) {		
		return super.getHibernateTemplate().executeFind(
				  new HibernateCallback(){
					public Object doInHibernate(Session session) throws HibernateException, SQLException {
						Criteria criteria=session.createCriteria(Users.class);
						if(null!=users){
							criteria.add(Example.create(users));
						}
						return criteria.list();
					}
				  });
	}

	//修改使用者
	public void update(Users users) {		
		super.getHibernateTemplate().update(users);
	}
	
	public Users load(Integer id) {
		Users user=(Users)super.getHibernateTemplate().get(Users.class, id);
		return user;
	}	  
}
