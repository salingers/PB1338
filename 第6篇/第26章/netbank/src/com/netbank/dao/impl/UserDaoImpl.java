package com.netbank.dao.impl;

import java.sql.SQLException;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.netbank.dao.UserDao;
import com.netbank.entity.*;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	

	//修改賬戶
	public boolean updateAccount(Account account) {
		super.getHibernateTemplate().merge(account);
		return true;
	}

	//根據username取得管理員
	public Admin getAdmin(String username) {
		String hql="from Admin as a where a.username=:username";
		Session session = this.getSessionFactory().getCurrentSession();
		Query query = session.createQuery(hql);
		query.setString("username", username);
		return (Admin) query.uniqueResult();
	}
	
	//修改管理員
	public boolean modifyAdmin(Admin admin) {
		super.getHibernateTemplate().update(admin);
		return true;
	}
	
	
	//根據查詢條件查詢使用者
	public Account searchAccounts(final Account account){
		
	 return	(Account) super.getHibernateTemplate().executeFind(new HibernateCallback(){
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Criteria c=session.createCriteria(Account.class);
				if(account.getUsername()!=null&&!"".equals(account.getUsername())){
					c.add(Restrictions.like("username", account.getUsername(),MatchMode.ANYWHERE));
				}
				c.addOrder(Order.asc("accountid"));
				return c.list();
			}
			
		});
	}
	
	//根據賬戶ID取得賬戶物件
	public Account getAccount(int id){
		return (Account) super.getHibernateTemplate().get(Account.class, id);
	}
	
	
	//根據username取得賬戶
	public Account getAccount(String username) {
		String hql="from Account as a where a.username=:username";
		Session session = this.getSessionFactory().getCurrentSession();
		Query query = session.createQuery(hql);
		query.setString("username", username);
		return (Account) query.uniqueResult();
	}
	
	//取得所有賬戶
	public List getAllAcconts() {
		String hql="from Account ";
		Session session = this.getSessionFactory().getCurrentSession();
		Query query = session.createQuery(hql);
		return query.list();
		
	}
	//加入賬戶
	public boolean addAccount(Account account) {
		super.getHibernateTemplate().save(account);
		return true;
	}
	/**
	 * 移除賬戶
	 */
	public boolean delAccount(Account account) {
		super.getHibernateTemplate().delete(account);
		return true;
	}
	
	/**
	 *根據名稱取得狀態
	 */
	public Status getStatus(String name) {
		String hql="from Status as s where s.name=:name";
		Session session = this.getSessionFactory().getCurrentSession();
		Query query = session.createQuery(hql);
		query.setString("name", name);
		return (Status) query.uniqueResult();
	}

	public Status getStatus(int id) {
		return (Status) super.getHibernateTemplate().get(Status.class, id);
	}
	
	//從session中重新取得物件account
	public void reflush(Account account){
		super.getHibernateTemplate().refresh(account);
	}
}
