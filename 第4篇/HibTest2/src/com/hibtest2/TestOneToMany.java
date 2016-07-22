package com.hibtest2;

import java.util.Iterator;

import com.hibtest2.dao.BaseHibernateDAO;
import com.hibtest2.entity.Books;
import com.hibtest2.entity.Publishers;

public class TestOneToMany extends BaseHibernateDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestOneToMany otm=new TestOneToMany();
		otm.testOneToMany();
	}
	public void testOneToMany(){
        //根據id取得Publishers物件
		Publishers publishers=(Publishers) super.get(Publishers.class, new Integer(1));
		System.out.println(publishers.getName()+"出版社出版的圖書內含：");
        //根據一對多映射，從Publishers物件中取得出版圖書名稱
		Iterator iter=publishers.getBks().iterator();
		while(iter.hasNext()){
			Books books=(Books)iter.next();
			System.out.println(books.getTitle());
		}
	}


}
