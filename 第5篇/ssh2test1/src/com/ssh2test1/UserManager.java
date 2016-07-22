package com.ssh2test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ssh2test1.biz.UserBiz;
public class UserManager {
	public boolean checkUserExist(String username) {		
		//載入applicationContext.xml組態
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//取得組態中的案例
		UserBiz userBiz =(UserBiz)context.getBean("userBiz");
		return userBiz.isExist(username);		
	}
}
