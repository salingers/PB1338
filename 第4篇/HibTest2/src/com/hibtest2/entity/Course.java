package com.hibtest2.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {

	// Fields

	private Integer courseId;
	private String courseName;
	private Set students=new HashSet();

	// Constructors

	public Set getStudents() {
		return students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

	/** default constructor */
	public Course() {
	}

	/** full constructor */
	public Course(String courseName) {
		this.courseName = courseName;
	}

	// Property accessors

	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}