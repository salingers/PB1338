package com.ssh2test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ssh2test1.biz.UserBiz;
public class UserManager {
	public boolean checkUserExist(String username) {		
		//���JapplicationContext.xml�պA
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//���o�պA�����ר�
		UserBiz userBiz =(UserBiz)context.getBean("userBiz");
		return userBiz.isExist(username);		
	}
}
