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
	   //建立兩個Student物件
		Student s1=new Student();
		s1.setStudentName("韋小寶");		
		Student s2=new Student();
		s2.setStudentName("令狐沖");
		//建立四個Course物件
		Course c1=new Course();
		c1.setCourseName("資料結構");
		Course c2=new Course();
		c2.setCourseName("動作系統");
		Course c3=new Course();
		c3.setCourseName("電腦群組成原理");
		Course c4=new Course();
		c4.setCourseName("離散數學");
		//設定s1與c1和c2之間的相互關聯
		s1.getCourses().add(c1);
		s1.getCourses().add(c2);
		/*c1.getStudents().add(s1);
		c2.getStudents().add(s1);*/
		//設定s2與c1、c3和c4之間的相互關聯
		s2.getCourses().add(c1);
		s2.getCourses().add(c3);
		s2.getCourses().add(c4);
		/*c1.getStudents().add(s2);
		c3.getStudents().add(s2);
		c4.getStudents().add(s2);*/
		//儲存c1、c2、c3和c4
		super.add(c1);
		super.add(c2);
		super.add(c3);
		super.add(c4);
        //儲存s1和s2物件
		super.add(s1);
		super.add(s2);
	}
	
	public void testAdd_2(){
		//建立"東方不敗"物件
		Student newStu=new Student();
		newStu.setStudentName("東方不敗");
	    //載入"電腦群組成原理"物件
		Course c=(Course)super.get(Course.class,new Integer(3));		
	    //設定newStu和c物件之間的關聯
		newStu.getCourses().add(c);		
		//儲存物件newStu
		super.add(newStu);	
		//更新物件c
		super.update(c);
	}
	
	public void testAdd_3(){
		//載入"韋小寶"和"東方不敗"物件
		Student wxb=(Student)super.get(Student.class, new Integer(1));
		Student dfbb=(Student)super.get(Student.class, new Integer(3));
	    //建立"編譯原理"課程物件
		Course byyl=new Course();
		byyl.setCourseName("編譯原理");
	    //設定wxb、dfbb與byyl物件之間的關聯
		wxb.getCourses().add(byyl);
		dfbb.getCourses().add(byyl);
	    //儲存byyl物件
		super.add(byyl);
	    //更新wxb和dfbb物件
		super.update(wxb);
		super.update(dfbb);
	}
	
	public void testDelete_1(){
		//載入"韋小寶"物件，並獲得其選課集合
		Student student=(Student)super.get(Student.class, new Integer(1));
		Iterator courses=student.getCourses().iterator();
	    //移除中介表sc中與"韋小寶"關聯的記錄
		while(courses.hasNext()){
			Course course=(Course)courses.next();
			course.getStudents().remove(student);	
		}
	    //將"韋小寶"物件移除
		super.delete(student);
	}
	public void testDelete_2(){
		//載入"令狐沖"物件
		Student student=(Student)super.get(Student.class, new Integer(2));
		//將"令狐沖"物件移除
		super.delete(student);

	}
	
}
