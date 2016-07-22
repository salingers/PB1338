package com.hibtest2;

import com.hibtest2.dao.BaseHibernateDAO;
import com.hibtest2.entity.Books;
import com.hibtest2.entity.Publishers;

public class TestM2OAndO2M extends BaseHibernateDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestM2OAndO2M m2o_o2m=new TestM2OAndO2M();
		//m2o_o2m.testAdd_1();
		//m2o_o2m.testAdd_2();
		//m2o_o2m.testAdd_3();
		//m2o_o2m.testAdd_4();
		//m2o_o2m.testDelete_1();
		//m2o_o2m.testDelete_2();
		m2o_o2m.testUpdate();
	}
	public void testAdd_1(){
        //�[�J�X�����T��
		Publishers publishers=new Publishers();
		publishers.setName("�q�l�u�~�X����");
		super.add(publishers);		
	}
	public void testAdd_2(){		
	    //���J�o��q�l�u�~�X�������骫��
		Publishers dzgy=(Publishers)super.get(Publishers.class, new Integer(4));
		//�s�W�ϮѪ���
		Books book1=new Books();		
		book1.setTitle("�椸���դ��DC#��");
		book1.setAuthor("�]���^��������");
		//�N�q�l�u�~�X��������]�w����骫��Books��publishers�ݩʤ�
		book1.setPublishers(dzgy);
		//�N�ϮѪ����x�s���Ʈw
		super.add(book1);	
		//�s�W�ϮѪ���
		Books book2=new Books();
		book2.setTitle("C++�����g�{���A���U1");
		book2.setAuthor("�]���^�I�K�S");
		//�N�q�l�u�~�X��������]�w����骫��Books��publishers�ݩʤ�
		book2.setPublishers(dzgy);
		//�N�ϮѪ����x�s���Ʈw
		super.add(book2);	
	}

	public void testAdd_3(){
	    //�إߤ��Q���q�X��������
		Publishers publishers=new Publishers();
		publishers.setName("���Q���q�X����");
		//�إ߲Ĥ@��Books����
		Books book1=new Books();		
		book1.setTitle("�G��C�y�t�{���]�p");
		book1.setAuthor("�J�F���A�����µ�");	
	    //�إ߲ĤG��Book����			
		Books book2=new Books();
		book2.setTitle("Visual Basic.NET");
		book2.setAuthor("�}�����D�s");		
		//�إ�Publishers����MBooks���󪺤@��h���V���p���t�A
		//�u�ݱqPublishers�@��i����@�Y�i
		publishers.getBks().add(book1);
		publishers.getBks().add(book2);
		//�x�sPublishers����
		super.add(publishers);
	}
	
	public void testAdd_4(){
		//�إߤ@��Publishers����
    	Publishers publishers=new Publishers();
		publishers.setName("��w�q�l��ޤj�ǥX����");
		//�إߨ��Books����
		Books book1=new Books();		
		book1.setTitle("Windows CE�M�ε{���]�p");
		book1.setAuthor("�i�i,�\�i�s��");
		Books book2=new Books();
		book2.setTitle("MATLAB�Ψ�b...");
		book2.setAuthor("���h�` �s��");
		//�ѩ�N���p���t�浹Books�Ӻ��@�A�ҥH�b�x�s�ɥ������T�a
	    //�NPublishers�]�w��Books�A�YBooks�����I�ssetPublishers()��k
		book1.setPublishers(publishers);
		book2.setPublishers(publishers);		
	    //�إ�Publishers����MBooks���󪺤@��h���V���p���t�A���x�sPublishers����
		publishers.getBks().add(book1);
		publishers.getBks().add(book2);		
		super.add(publishers);
	}
	
	public void testDelete_1(){
		//���J�ݲ�����Books����
		Books book=(Books)super.get(Books.class, new Integer(4939));
	    //�I�s�����O��delete��k��������
		super.delete(book);
	}
	
	public void testDelete_2(){
		//���J���Q���q�X��������
		Publishers publisher=(Publishers)super.get(Publishers.class, new Integer(5));
		super.delete(publisher);	
	}
	
	public void testUpdate(){
	    //���J"Windows CE�M�ε{���]�p"�Ϯѹ��骫��
		Books web_yykf=(Books)super.get(Books.class, new Integer(4958));
		//���J"��w�q�l��ޤj�ǥX����"�M"����u�~�X����"��ӥX�������骫��
	    Publishers xadz=(Publishers)super.get(Publishers.class, new Integer(6));
		Publishers jxgy=(Publishers)super.get(Publishers.class, new Integer(3));
		//�q"��w�q�l��ޤj�ǥX����"���� bks�ݩʤ������Ϯ�"Windows CE�M�ε{���]�p"�A
		//�÷s�W��"����u�~�X����"��bks�ݩʤ��A�P�ɱN"����u�~�X����"�]�w��ӹϮѪ���
	    xadz.getBks().remove(web_yykf);	
	    jxgy.getBks().add(web_yykf);
		web_yykf.setPublishers(jxgy);
	    //��s"Windows CE�M�ε{���]�p"�ϮѪ���
		super.update(web_yykf);
	}


}
