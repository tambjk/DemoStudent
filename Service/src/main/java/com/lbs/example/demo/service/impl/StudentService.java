package com.lbs.example.demo.service.impl;

import com.lbs.example.demo.dao.service.base.IStudentDaoService;
import com.lbs.example.demo.domain.StudentDto;
import com.lbs.example.demo.service.base.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Erman.Kaygusuzer on 21/07/2022
 */
@Service
public class StudentService implements IStudentService {

	@Autowired
	private IStudentDaoService studentDaoService;

	@Override
	//	@Transactional
	public StudentDto saveStudent(StudentDto studentDto) {
		StudentDto student = studentDaoService.saveStudent(studentDto);
		if(student != null){
			throw new RuntimeException("test");
		}
		return student;
	}
}
