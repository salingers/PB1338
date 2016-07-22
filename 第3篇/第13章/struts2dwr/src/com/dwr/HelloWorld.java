package com.dwr;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public HelloWorld() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello(String name) {
		
		return "Hello, " + name;
	}

}