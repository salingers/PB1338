package com.inter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class FilterHelloInterceptor extends MethodFilterInterceptor
{

	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception
	{
		System.out.print("�޿誺��{�L�{�O�@�˪��A�u�O��k�W���P�Ӥw�I");
		String reString = arg0.invoke();
		return reString;
	}

	@Override
	public void setExcludeMethods(String excludeMethods)
	{
		// TODO Auto-generated method stub
		super.setExcludeMethods(excludeMethods);
	}

	@Override
	public void setIncludeMethods(String includeMethods)
	{
		// TODO Auto-generated method stub
		super.setIncludeMethods(includeMethods);
	}

}
