package com.inter;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CheckInterceptor extends AbstractInterceptor
{

	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception
	{
		ActionContext actionContext = arg0.getInvocationContext();

		Map<?, ?> sessionMap = actionContext.getSession();

		String user = (String) sessionMap.get("name");
		
		if (user != null && user.equals("niukor"))
		{
			return arg0.invoke();
		}
		actionContext.put("tip", "½Ð¥ýµn¤J¡I");
		return Action.LOGIN;
	}

}
