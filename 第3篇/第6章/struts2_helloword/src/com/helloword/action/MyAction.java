package com.helloword.action;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport{

	@Override //重新定義
	public String execute() throws Exception {
		//SUCCESS是一個常數。也可以寫成
		//return "success";
		return SUCCESS;
	}

}
