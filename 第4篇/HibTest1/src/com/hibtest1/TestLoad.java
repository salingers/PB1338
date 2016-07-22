package com.hibtest1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibtest1.entity.Users;

public class TestLoad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestLoad().testLoad();
	}
	
	private void testLoad(){
		//1.起始化,讀取組態檔hibernate.cfg.xml
		Configuration config=new Configuration().configure();
		//2.讀取並解析映射檔案(Users.hbm.xml)，建立sessionFactory
		SessionFactory sessionFactory=config.buildSessionFactory();
		//3.開啟session
		Session session=sessionFactory.openSession();
		//4.載入資料
		Users user=(Users)session.get(Users.class, new Integer(1));
		//在主控台輸出使用者名稱和密碼
		System.out.println(user.getLoginName()+" "+user.getLoginPwd());
	}

}
