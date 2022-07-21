package com.lbs.example.demo.entity;

import com.lbs.example.demo.entity.base.BaseEntity;

import java.time.LocalDate;

/**
 * Created by Erman.Kaygusuzer on 21/07/2022
 */
public class Course extends BaseEntity {

	private String classroomId;
	private String instructorId;
	private LocalDate date;

	public String getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(String classroomId) {
		this.classroomId = classroomId;
	}

	public String getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
