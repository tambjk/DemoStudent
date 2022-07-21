package com.lbs.example.demo.entity;

import com.lbs.example.demo.entity.base.BaseEntity;

/**
 * Created by Erman.Kaygusuzer on 21/07/2022
 */
public class CourseAssign extends BaseEntity {

	private String courseId;
	private String studentId;

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
}
