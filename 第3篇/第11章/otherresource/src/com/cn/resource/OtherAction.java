package com.cn.resource;

import com.opensymphony.xwork2.ActionSupport;

public class OtherAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		
		System.out.println(getText("msg"));
		
		return super.execute();
	}
}
