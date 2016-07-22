package com.hibtest2;

import java.util.*;
import org.hibernate.*;
import org.hibernate.criterion.*;
import com.hibtest2.entity.Books;

public class TestCriteria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestCriteria tc=new TestCriteria();	
		
		//使用物件封裝查詢條件
		/*Books books=new Books();
		books.setTitle("Web套用");  
		tc.testCriteria_1(books);*/
		
		//tc.testCriteria_2();		
	    //tc.testCriteria_2_1();
		//tc.testCriteria_3();
		//tc.testCriteria_4();
		
		tc.testDetachedCriteria();

	}
	/**
	 * 使用Criteria物件進行簡單查詢
	 * @param condition
	 */
	public void testCriteria_1(Books condition){
		//獲得session
		Session session=HibernateSessionFactory.getSession();
		//建立Criteria物件
		Criteria criteria=session.createCriteria(Books.class);
		//使用Restrictions物件撰寫查詢條件，並將查詢條件加入Criteria物件
		if(condition!=null){			
			if(condition.getTitle()!=null && !condition.getTitle().equals("")){
				//按書名進行篩選
				criteria.add(Restrictions.like("title", condition.getTitle(),
	MatchMode.ANYWHERE));
			}
			if(condition.getAuthor()!=null && !condition.getAuthor().equals("")){
				//按作者進行篩選
				criteria.add(Restrictions.like("author", condition.getAuthor(),
	MatchMode.ANYWHERE));
			}
		}
		//排序
		criteria.addOrder(Order.asc("id"));
		//執行查詢，獲得結果
		List list=criteria.list();
		//檢查查詢結果
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}
	
	/**
	 * 使用Criterion 並透過 Restrictions 工具類別，實現關聯查詢
	 */
	public void testCriteria_2(){
		Session session=HibernateSessionFactory.getSession();
		Criteria bookCriteria=session.createCriteria(Books.class);
		//設定從Books類別中查詢的條件
		bookCriteria.add(Restrictions.like("title", "C++",MatchMode.ANYWHERE));
		//建立一個新的Criteria案例，以參考pulishers集合中的元素
		Criteria publishersCriteria=bookCriteria.createCriteria("publishers");
		//設定從關聯的Publishers類別中查詢的條件
		publishersCriteria.add(Restrictions.like("name", "清華大學出版社"));
		List list=publishersCriteria.list();
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}
	
	/**
	 * 采用方法鏈寫程式風格,使用Criteria物件進行查詢
	 */
	public void testCriteria_2_1(){
		Session session=HibernateSessionFactory.getSession();
		List list=session.createCriteria(Books.class)
		.add(Restrictions.like("title", "C++",MatchMode.ANYWHERE))
		.createCriteria("publishers")
		.add(Restrictions.like("name", "清華大學出版社")).list();
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}
	
	/**
	 * 使用Criterion 並透過 Restrictions 工具類別，實現分頁查詢
	 */
	public void testCriteria_3(){
		Session session=HibernateSessionFactory.getSession();
		Criteria criteria=session.createCriteria(Books.class);
		//從第一個物件開始查詢
		criteria.setFirstResult(0);
		//每次從查詢結果中傳回4個物件
		criteria.setMaxResults(4);
		List list=criteria.list();
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}
	
	/**
	 * 使用Expression類別實現查詢
	 */
	public void testCriteria_4(){
		Session session=HibernateSessionFactory.getSession();
		List list=session.createCriteria(Books.class)
		//使用Expression類別撰寫查詢條件
		.add(Expression.like("title", "C++",MatchMode.ANYWHERE))
		//對查詢結果進行排序
		.addOrder(Order.asc("id")).list();
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}
	
	/**
	 * 使用DetachedCriteria查詢
	 */
	public void testDetachedCriteria(){
		//建立離線查詢DetachedCriteria案例
		DetachedCriteria query=DetachedCriteria.forClass(Books.class)
		.add(Property.forName("title").eq("Web套用開發技術"));
		//建立Hibernate Session
		Session session=HibernateSessionFactory.getSession();
		//執行查詢
		List list=query.getExecutableCriteria(session).list();
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}








}
