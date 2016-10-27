package com.inter;

import com.action.HelloAction;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class HelloInterceptor extends AbstractInterceptor
{

	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception
	{

		@SuppressWarnings("unused")
		HelloAction haAction = (HelloAction) arg0.getAction();
		System.out.print("攔截器開始執行……");

		String resuletString = arg0.invoke();
		System.out.println("攔截器已結束……");

		return resuletString;
	}

}
