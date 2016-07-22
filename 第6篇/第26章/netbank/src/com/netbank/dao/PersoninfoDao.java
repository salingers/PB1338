package com.netbank.dao;

import java.util.List;

import com.netbank.entity.*;

public interface PersoninfoDao {
	//修改個人訊息
	public void modifyPersoninfo(Personinfo personinfo);
	
	//取得全部使用者訊息
	public List getAllPersoninfo();
	
	//加入個人訊息
	public boolean add(Personinfo personinfo);

	//根據條件查詢個人訊息
	public List searchPersoninfo(Personinfo personinfo);
	
	//根據賬戶狀態取得使用者訊息
	public List searchPersoninfo(Status status);
}
