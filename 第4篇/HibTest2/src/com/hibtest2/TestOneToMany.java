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
        //�ھ�id���oPublishers����
		Publishers publishers=(Publishers) super.get(Publishers.class, new Integer(1));
		System.out.println(publishers.getName()+"�X�����X�����ϮѤ��t�G");
        //�ھڤ@��h�M�g�A�qPublishers���󤤨��o�X���ϮѦW��
		Iterator iter=publishers.getBks().iterator();
		while(iter.hasNext()){
			Books books=(Books)iter.next();
			System.out.println(books.getTitle());
		}
	}


}
