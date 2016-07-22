package com.springtest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtest1.biz.UserBiz;

public class AOPXmlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//���JapplicationContext.xml�պA
		ApplicationContext context=new ClassPathXmlApplicationContext("aop.xml");
		//���o�պA����UserBizImpl�ר�
		UserBiz userBiz =(UserBiz)context.getBean("userBiz");	
		userBiz.addUser("zhangsan", "123");
		userBiz.delUser(1);

	}

}
