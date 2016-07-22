package com.hibtest2;

import com.hibtest2.dao.BaseHibernateDAO;
import com.hibtest2.entity.Books;

public class TestManyToOne extends BaseHibernateDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestManyToOne mto=new TestManyToOne();
		mto.testManyToOne();
	}
	public void testManyToOne(){
        //根據id取得Books物件
		Books books=(Books) super.get(Books.class, new Integer(4947));		
        //根據多對一映射，從Books物件中取得指定圖書的出版社
		System.out.println("編號是4947的圖書出版社是："+books.getPublishers().getName().toString());		
	}


}
