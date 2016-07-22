package com.hibtest2;

import java.util.Iterator;

import com.hibtest2.dao.BaseHibernateDAO;
import com.hibtest2.entity.Course;
import com.hibtest2.entity.Student;

public class TestManyToMany extends BaseHibernateDAO  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestManyToMany m2m=new TestManyToMany();
		//m2m.testAdd_1();	
		//m2m.testAdd_2();
		//m2m.testAdd_3();
		//m2m.testDelete_1();
		m2m.testDelete_2();
	}
	
	public void testAdd_1(){
	   //�إߨ��Student����
		Student s1=new Student();
		s1.setStudentName("���p�_");		
		Student s2=new Student();
		s2.setStudentName("�O���R");
		//�إߥ|��Course����
		Course c1=new Course();
		c1.setCourseName("��Ƶ��c");
		Course c2=new Course();
		c2.setCourseName("�ʧ@�t��");
		Course c3=new Course();
		c3.setCourseName("�q���s�զ���z");
		Course c4=new Course();
		c4.setCourseName("�����ƾ�");
		//�]�ws1�Pc1�Mc2�������ۤ����p
		s1.getCourses().add(c1);
		s1.getCourses().add(c2);
		/*c1.getStudents().add(s1);
		c2.getStudents().add(s1);*/
		//�]�ws2�Pc1�Bc3�Mc4�������ۤ����p
		s2.getCourses().add(c1);
		s2.getCourses().add(c3);
		s2.getCourses().add(c4);
		/*c1.getStudents().add(s2);
		c3.getStudents().add(s2);
		c4.getStudents().add(s2);*/
		//�x�sc1�Bc2�Bc3�Mc4
		super.add(c1);
		super.add(c2);
		super.add(c3);
		super.add(c4);
        //�x�ss1�Ms2����
		super.add(s1);
		super.add(s2);
	}
	
	public void testAdd_2(){
		//�إ�"�F�褣��"����
		Student newStu=new Student();
		newStu.setStudentName("�F�褣��");
	    //���J"�q���s�զ���z"����
		Course c=(Course)super.get(Course.class,new Integer(3));		
	    //�]�wnewStu�Mc���󤧶������p
		newStu.getCourses().add(c);		
		//�x�s����newStu
		super.add(newStu);	
		//��s����c
		super.update(c);
	}
	
	public void testAdd_3(){
		//���J"���p�_"�M"�F�褣��"����
		Student wxb=(Student)super.get(Student.class, new Integer(1));
		Student dfbb=(Student)super.get(Student.class, new Integer(3));
	    //�إ�"�sĶ��z"�ҵ{����
		Course byyl=new Course();
		byyl.setCourseName("�sĶ��z");
	    //�]�wwxb�Bdfbb�Pbyyl���󤧶������p
		wxb.getCourses().add(byyl);
		dfbb.getCourses().add(byyl);
	    //�x�sbyyl����
		super.add(byyl);
	    //��swxb�Mdfbb����
		super.update(wxb);
		super.update(dfbb);
	}
	
	public void testDelete_1(){
		//���J"���p�_"����A����o���Ҷ��X
		Student student=(Student)super.get(Student.class, new Integer(1));
		Iterator courses=student.getCourses().iterator();
	    //����������sc���P"���p�_"���p���O��
		while(courses.hasNext()){
			Course course=(Course)courses.next();
			course.getStudents().remove(student);	
		}
	    //�N"���p�_"���󲾰�
		super.delete(student);
	}
	public void testDelete_2(){
		//���J"�O���R"����
		Student student=(Student)super.get(Student.class, new Integer(2));
		//�N"�O���R"���󲾰�
		super.delete(student);

	}
	
}
