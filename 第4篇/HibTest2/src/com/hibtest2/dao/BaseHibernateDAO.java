package com.hibtest2.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

import com.hibtest2.HibernateSessionFactory;
import com.sun.org.apache.regexp.internal.recompile;

public abstract class BaseHibernateDAO {
	/**
	 * 加入資料
	 * @param object
	 */
	protected void add(Object object){
		Transaction tran=null;
		//取得session
		Session session=HibernateSessionFactory.getSession();
		try{
			//開始交易
			tran=session.beginTransaction();
			//持久化動作
		    session.save(object);
		    //傳送交易
		    tran.commit();
		}catch (Exception e) {
			if(tran!=null){
				//交易返回
				tran.rollback();
			}
			e.printStackTrace();
		}finally{
			//關閉session
			session.close();
		}		
	}	
	
	/**
	 * 載入資料
	 * @param cla
	 * @param id
	 * @return
	 */
	protected Object get(Class cla,Serializable id){
		Object object=null;
		Session session=HibernateSessionFactory.getSession();
		try{
			object=session.get(cla, id);
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return object;
	}	
	
	/**
	 * 移除資料
	 * @param object
	 */
	protected void delete(Object object){
		Transaction tran=null;
		Session session=HibernateSessionFactory.getSession();
		try{
			tran=session.beginTransaction();
		    session.delete(object);
		    tran.commit();
		}catch (Exception e) {
			if(tran!=null){
				tran.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
	}	
	
	/**
	 * 修改資料
	 * @param object
	 */
	protected void update(Object object){
		Transaction tran=null;
		Session session=HibernateSessionFactory.getSession();
		try{
			tran=session.beginTransaction();
		    session.update(object);
		    tran.commit();
		}catch (Exception e) {
			if(tran!=null){
				tran.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
	}	
	
	/**
	 * 查詢資料
	 * @param cla
	 * @param condition
	 * @return
	 */
protected List search(Class cla,Object condition){
	Session session=null;
	List list=null;
	try {
		session=HibernateSessionFactory.getSession();
		list=session.createCriteria(cla).add(Example.create(condition)).list();
	} catch (Exception e) {
		// TODO: handle exception
	} finally{
		session.close();
	}
	return list;		
}	
}
