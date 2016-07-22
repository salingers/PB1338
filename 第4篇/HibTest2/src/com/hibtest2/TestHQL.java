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
        //���osession
		Session session=HibernateSessionFactory.getSession();
        //���gHQL�ԭz
		String hql="from Books";
        //�إ�Query����
		Query query=session.createQuery(hql);
        //����d�ߡA��o���G
		List list=query.list();
		//�ˬd�d�ߵ��G
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+" "+book.getAuthor()+" "+book.getContentDescription());
		}
	}
	
	/**
	 * �ݩʬd��
	 */
	public void testHql_2(){
		Session session=HibernateSessionFactory.getSession();
		//���gHQL�ԭz�A�ϥ��ݩʬd��
		String hql="select books.title,books.author from Books as books";
		Query query=session.createQuery(hql);
		List list=query.list();
		Iterator itor=list.iterator();
		//�C�ѰO���ʸ˦��@��Object�}�C
		while(itor.hasNext()){
			Object[] object=(Object[])itor.next();
			System.out.println(object[0]+"      "+object[1]);
		}
	}
	
	/**
	 * �ѼƬd�ߡA���ѼƦ�m�d��
	 */
	public void testHql_3(){
		Session session=HibernateSessionFactory.getSession();
		//���gHQL�ԭz,�ϥΰѼƬd��
		String hql="from Books books where books.title like ? ";
		Query query=session.createQuery(hql);
		//��HQL�ԭz����?���N���ѼƳ]�w��
		query.setString(0, "%C++%");
		List list=query.list();
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}

	/**
	 * �ѼƬd�ߡA���ѼƦW�r�d��
	 */
	public void testHql_4(){
		Session session=HibernateSessionFactory.getSession();
		//�z�L":bookTitle"�w�q�R�W�Ѽ�"bookTitle"
		String hql="from Books books where books.title=:bookTitle";
		Query query=session.createQuery(hql);
		//���R�W�ѼƳ]�w��
		query.setString("bookTitle", "C++ Primer���媩");
		List list=query.list();
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}
	
	/**
	 * �s�u�d��
	 */
	public void testHql_5(){
		Session session=HibernateSessionFactory.getSession();
		//���gHQL�ԭz,�ϥγs�u�d��
		String hql="select b from Books b,Publishers p where b.publishers=p and p.name='�M�ؤj�ǥX����'";
		Query query=session.createQuery(hql);
		List list=query.list();
		Iterator itor=list.iterator();
		while(itor.hasNext()){
			Books book=(Books)itor.next();
			System.out.println(book.getTitle()+"      "+book.getAuthor()+"       "+book.getContentDescription());
		}
	}
	
	/**
	 * �����d��
	 */
	public void testHql_6(){
		Session session=HibernateSessionFactory.getSession();
		//���ѦW�ɾ��d�߹ϮѪ���
		String hql="from Books b order by b.title asc";
		Query query=session.createQuery(hql);
		//�q�Ĥ@�Ӫ���}�l�d��
		query.setFirstResult(0);
		//�q�d�ߵ��G���@���Ǧ^3�Ӫ���
		query.setMaxResults(3);
		//����d��
		List list=query.list();
		//�ˬd�d�ߵ��G
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
	 * �E�����
	 */
	public void testHql_7(){
		Session session=HibernateSessionFactory.getSession();
		//�έp�O���`��
		String hql1="select count(b) from Books b";
		Query query1=session.createQuery(hql1);
		Long count=(Long)query1.uniqueResult();		
		//�έp�Ѫ��������B
		String hql2="select avg(b.unitPrice) from Books b";
		Query query2=session.createQuery(hql2);
		Double money=(Double)query2.uniqueResult();	
		//�έp�̶Q�M�̫K�y���Ϯ�
		String hql3="select min(b.unitPrice),max(b.unitPrice) from Books b";
		Query query3=session.createQuery(hql3);
		Object[] price=(Object[])query3.uniqueResult();
		System.out.println("�O���`��"+count.toString()+"  �������B"+
				money.toString()+"  �ѻ��̧C��"+price[0].toString()+
				"  �ѻ��̰���"+price[1].toString());		
	}



}
