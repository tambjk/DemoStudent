package com.lbs.example.demo.domain;

import com.lbs.example.demo.domain.base.BaseDto;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Erman.Kaygusuzer on 21/07/2022
 */
public class CourseDto extends BaseDto {

	private ClassroomDto classroom;
	private InstructorDto instructor;
	private List<StudentDto> studentList;
	private LocalDate date;

	public ClassroomDto getClassroom() {
		return classroom;
	}

	public void setClassroom(ClassroomDto classroom) {
		this.classroom = classroom;
	}

	public InstructorDto getInstructor() {
		return instructor;
	}

	public void setInstructor(InstructorDto instructor) {
		this.instructor = instructor;
	}

	public List<StudentDto> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentDto> studentList) {
		this.studentList = studentList;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
