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
		//載入applicationContext.xml組態
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//取得組態中的UserBizImpl案例
		UserBiz userBiz =(UserBiz)context.getBean("userBiz");		
		//呼叫方法
		boolean flag=userBiz.login("admin", "123");
		if(flag){
			System.out.println("登入成功");
		}else{
			System.out.println("登入失敗");
		}
	}

}
