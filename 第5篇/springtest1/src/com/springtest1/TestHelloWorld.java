package com.springtest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//���JapplicationContext.xml�պA
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//���o�պA�����ר�
		HelloWorld hw =(HelloWorld)context.getBean("hw");
		//�I�s��k
		hw.show();		
	}
}
