package com.hibtest2.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Publishers entity. @author MyEclipse Persistence Tools
 */

public class Publishers implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set bks=new HashSet();

	// Constructors

	public Set getBks() {
		return bks;
	}

	public void setBks(Set bks) {
		this.bks = bks;
	}

	/** default constructor */
	public Publishers() {
	}

	/** full constructor */
	public Publishers(String name) {
		this.name = name;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}