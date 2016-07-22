package com.hibtest2.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer studentId;
	private String studentName;
	private Set courses=new HashSet();

	// Constructors

	public Set getCourses() {
		return courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(String studentName) {
		this.studentName = studentName;
	}

	// Property accessors

	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}