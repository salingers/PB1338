package com.ssh2test1.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ssh2test1.entity.Users;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	public List search(final Users condition) {
		return super.getHibernateTemplate().executeFind(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				// TODO 自動產生方法存根
				Criteria c=session.createCriteria(Users.class);
				if(condition!=null){
					if(condition.getLoginName()!=null && !condition.getLoginName().equals("")){
						c.add(Restrictions.eq("loginName", condition.getLoginName()));
					}
					if(condition.getLoginPwd()!=null && !condition.getLoginPwd().equals("")){
						c.add(Restrictions.eq("loginPwd", condition.getLoginPwd()));
					}
				}
				return c.list();
			}
		});		
	}

	public void updateUsers() {
		//從資料表users中取得編號為8的使用者,將其密碼修改為"1"
		Users u1=(Users)super.getHibernateTemplate().get(Users.class, new Integer(8));
		u1.setLoginPwd("1");
		super.getHibernateTemplate().saveOrUpdate(u1);
		//此處故意引入一個錯誤，判斷交易返回是否成功
		//int i=2/0;
		//從資料表users中取得編號為9的使用者,將其密碼修改為"2"
		Users u2=(Users)super.getHibernateTemplate().get(Users.class, new Integer(9));
		u2.setLoginPwd("2");		
		super.getHibernateTemplate().saveOrUpdate(u2);
	}	

}
