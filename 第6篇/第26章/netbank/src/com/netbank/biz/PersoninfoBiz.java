package com.netbank.biz;

import java.util.List;

import com.netbank.entity.*;


public interface PersoninfoBiz {
	//修改個人訊息
	public boolean modifyPersoninfo(Personinfo personinfo);
	
	//加入個人訊息
	public boolean add(Personinfo personinfo);

	//取得全部個人訊息
	public List getAllPersoninfo();
	
	//根據條件查詢個人訊息
	public List searchPersoninfo(Personinfo personinfo);
	
	//根據賬戶狀態取得個人訊息
	public List searchPersoninfo(Status status);
}
