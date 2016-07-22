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
		
		//�ϥΪ���ʸˬd�߱���
		/*Books books=new Books();
		books.setTitle("Web�M��");  
		tc.testCriteria_1(books);*/
		
		//tc.testCriteria_2();		
	    //tc.testCriteria_2_1();
		//tc.testCriteria_3();
		//tc.testCriteria_4();
		
		tc.testDetachedCriteria();

	}
	/**
	 * �ϥ�Criteria����i��²��d��
	 * @param condition
	 */
	public void testCriteria_1(Books condition){
		//��osession
		Session session=HibernateSessionFactory.getSession();
		//�إ�Criteria����
		Criteria criteria=session.createCriteria(Books.class);
		//�ϥ�Restrictions���󼶼g�d�߱���A�ñN�d�߱���[�JCriteria����
		if(condition!=null){			
			if(condition.getTitle()!=null && !condition.getTitle().equals("")){
				//���ѦW�i��z��
				criteria.add(Restrictions.like("title", condition.getTitle(),
	MatchMode.ANYWHERE));
			}
			if(condition.getAuthor()!=null && !condition.getAuthor().equals("")){
				//���@�̶i��z��
				criteria.add(Restrictions.like("author", condition.getAuthor(),
	MatchMode.ANYWHERE));
			}
		}
		//�Ƨ�
		criteria.addOrder(Order.asc("id"));
		//����d�ߡA��o���G
		List list=criteria.list();
		//�ˬd�d�ߵ��G
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}
	
	/**
	 * �ϥ�Criterion �óz�L Restrictions �u�����O�A��{���p�d��
	 */
	public void testCriteria_2(){
		Session session=HibernateSessionFactory.getSession();
		Criteria bookCriteria=session.createCriteria(Books.class);
		//�]�w�qBooks���O���d�ߪ�����
		bookCriteria.add(Restrictions.like("title", "C++",MatchMode.ANYWHERE));
		//�إߤ@�ӷs��Criteria�רҡA�H�Ѧ�pulishers���X��������
		Criteria publishersCriteria=bookCriteria.createCriteria("publishers");
		//�]�w�q���p��Publishers���O���d�ߪ�����
		publishersCriteria.add(Restrictions.like("name", "�M�ؤj�ǥX����"));
		List list=publishersCriteria.list();
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}
	
	/**
	 * ���Τ�k��g�{������,�ϥ�Criteria����i��d��
	 */
	public void testCriteria_2_1(){
		Session session=HibernateSessionFactory.getSession();
		List list=session.createCriteria(Books.class)
		.add(Restrictions.like("title", "C++",MatchMode.ANYWHERE))
		.createCriteria("publishers")
		.add(Restrictions.like("name", "�M�ؤj�ǥX����")).list();
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}
	
	/**
	 * �ϥ�Criterion �óz�L Restrictions �u�����O�A��{�����d��
	 */
	public void testCriteria_3(){
		Session session=HibernateSessionFactory.getSession();
		Criteria criteria=session.createCriteria(Books.class);
		//�q�Ĥ@�Ӫ���}�l�d��
		criteria.setFirstResult(0);
		//�C���q�d�ߵ��G���Ǧ^4�Ӫ���
		criteria.setMaxResults(4);
		List list=criteria.list();
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}
	
	/**
	 * �ϥ�Expression���O��{�d��
	 */
	public void testCriteria_4(){
		Session session=HibernateSessionFactory.getSession();
		List list=session.createCriteria(Books.class)
		//�ϥ�Expression���O���g�d�߱���
		.add(Expression.like("title", "C++",MatchMode.ANYWHERE))
		//��d�ߵ��G�i��Ƨ�
		.addOrder(Order.asc("id")).list();
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}
	
	/**
	 * �ϥ�DetachedCriteria�d��
	 */
	public void testDetachedCriteria(){
		//�إ����u�d��DetachedCriteria�ר�
		DetachedCriteria query=DetachedCriteria.forClass(Books.class)
		.add(Property.forName("title").eq("Web�M�ζ}�o�޳N"));
		//�إ�Hibernate Session
		Session session=HibernateSessionFactory.getSession();
		//����d��
		List list=query.getExecutableCriteria(session).list();
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}








}
