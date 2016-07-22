package com.springtest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtest1.biz.UserBiz;

public class TestSpring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���JapplicationContext.xml�պA
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//���o�պA����UserBizImpl�ר�
		UserBiz userBiz =(UserBiz)context.getBean("userBiz");		
		//�I�s��k
		boolean flag=userBiz.login("admin", "123");
		if(flag){
			System.out.println("�n�J���\");
		}else{
			System.out.println("�n�J����");
		}
	}

}
