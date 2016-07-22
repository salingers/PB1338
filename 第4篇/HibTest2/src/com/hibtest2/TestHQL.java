package com.hibtest2;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibtest2.entity.Books;

public class TestHQL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestHQL tHql=new TestHQL();
		//tHql.testHql_1();
		//tHql.testHql_2();
		//tHql.testHql_3();
		//tHql.testHql_4();
		//tHql.testHql_5();
		//tHql.testHql_6();
		//tHql.pagedSearch(2, 3);
		tHql.testHql_7();
	}
	
	public void testHql_1(){
        //眔session
		Session session=HibernateSessionFactory.getSession();
        //级糶HQL痹瓃
		String hql="from Books";
        //ミQueryン
		Query query=session.createQuery(hql);
        //磅︽琩高莉眔挡狦
		List list=query.list();
		//浪琩琩高挡狦
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+" "+book.getAuthor()+" "+book.getContentDescription());
		}
	}
	
	/**
	 * 妮┦琩高
	 */
	public void testHql_2(){
		Session session=HibernateSessionFactory.getSession();
		//级糶HQL痹瓃ㄏノ妮┦琩高
		String hql="select books.title,books.author from Books as books";
		Query query=session.createQuery(hql);
		List list=query.list();
		Iterator itor=list.iterator();
		//–ぱ癘魁杆ΘObject皚
		while(itor.hasNext()){
			Object[] object=(Object[])itor.next();
			System.out.println(object[0]+"      "+object[1]);
		}
	}
	
	/**
	 * 把计琩高把计竚琩高
	 */
	public void testHql_3(){
		Session session=HibernateSessionFactory.getSession();
		//级糶HQL痹瓃,ㄏノ把计琩高
		String hql="from Books books where books.title like ? ";
		Query query=session.createQuery(hql);
		//倒HQL痹瓃い¨?〃把计砞﹚
		query.setString(0, "%C++%");
		List list=query.list();
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}

	/**
	 * 把计琩高把计琩高
	 */
	public void testHql_4(){
		Session session=HibernateSessionFactory.getSession();
		//硓筁":bookTitle"﹚竡㏑把计"bookTitle"
		String hql="from Books books where books.title=:bookTitle";
		Query query=session.createQuery(hql);
		//倒㏑把计砞﹚
		query.setString("bookTitle", "C++ Primerいゅ");
		List list=query.list();
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}
	
	/**
	 * 硈絬琩高
	 */
	public void testHql_5(){
		Session session=HibernateSessionFactory.getSession();
		//级糶HQL痹瓃,ㄏノ硈絬琩高
		String hql="select b from Books b,Publishers p where b.publishers=p and p.name='睲地厩'";
		Query query=session.createQuery(hql);
		List list=query.list();
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}
	
	/**
	 * だ琩高
	 */
	public void testHql_6(){
		Session session=HibernateSessionFactory.getSession();
		//ど经琩高瓜ン
		String hql="from Books b order by b.title asc";
		Query query=session.createQuery(hql);
		//眖材ン秨﹍琩高
		query.setFirstResult(0);
		//眖琩高挡狦いΩ肚3ン
		query.setMaxResults(3);
		//磅︽琩高
		List list=query.list();
		//浪琩琩高挡狦
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}	
	
public void pagedSearch(int pageIndex,int pageSize){
	Session session=HibernateSessionFactory.getSession();
	String hql="from Books b order by b.title asc";
	Query query=session.createQuery(hql);
	int startIndex=(pageIndex-1)*pageSize;
	query.setFirstResult(startIndex);
	query.setMaxResults(pageSize);
	List list=query.list();
	Iterator itor=list.iterator();
	while(itor.hasNext()){
		Books book=(Books)itor.next();
		System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
	}
}
	
	/**
	 * 籈栋ㄧ计
	 */
	public void testHql_7(){
		Session session=HibernateSessionFactory.getSession();
		//参璸癘魁羆计
		String hql1="select count(b) from Books b";
		Query query1=session.createQuery(hql1);
		Long count=(Long)query1.uniqueResult();		
		//参璸キА肂
		String hql2="select avg(b.unitPrice) from Books b";
		Query query2=session.createQuery(hql2);
		Double money=(Double)query2.uniqueResult();	
		//参璸程禥㎝程獽﹜瓜
		String hql3="select min(b.unitPrice),max(b.unitPrice) from Books b";
		Query query3=session.createQuery(hql3);
		Object[] price=(Object[])query3.uniqueResult();
		System.out.println("癘魁羆计"+count.toString()+"  キА肂"+
				money.toString()+"  基程"+price[0].toString()+
				"  基程蔼"+price[1].toString());		
	}



}
