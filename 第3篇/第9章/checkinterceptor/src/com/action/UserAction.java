package com.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport
{

	private static final long serialVersionUID = 1L;

	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	private String pass;

	public String getPass()
	{
		return pass;
	}

	public void setPass(String pass)
	{
		this.pass = pass;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception
	{
		ActionContext contex = ActionContext.getContext();

		Map session = contex.getSession();
		
		if (getName().equals("niukor") && getPass().equals("niukor"))
		{
			session.put("name", getName());

			return SUCCESS;
		}
		else
		{
			contex.put("tip", "使用者名稱或密碼不對！");

			return ERROR;
		}
	}

}
