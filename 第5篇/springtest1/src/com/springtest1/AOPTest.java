package com.springtest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtest1.biz.UserBiz;

public class AOPTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//載入applicationContext.xml組態
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//取得組態中的UserBizImpl案例
		UserBiz userBiz =(UserBiz)context.getBean("ub");	
		userBiz.addUser("zhangsan", "123");
		userBiz.delUser(1);

	}

}
