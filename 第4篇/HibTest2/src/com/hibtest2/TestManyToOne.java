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
        //�ھ�id���oBooks����
		Books books=(Books) super.get(Books.class, new Integer(4947));		
        //�ھڦh��@�M�g�A�qBooks���󤤨��o���w�ϮѪ��X����
		System.out.println("�s���O4947���ϮѥX�����O�G"+books.getPublishers().getName().toString());		
	}


}
