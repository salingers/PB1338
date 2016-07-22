package com.springtest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//載入applicationContext.xml組態
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//取得組態中的案例
		HelloWorld hw =(HelloWorld)context.getBean("hw");
		//呼叫方法
		hw.show();		
	}
}
