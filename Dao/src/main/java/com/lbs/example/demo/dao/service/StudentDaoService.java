package com.lbs.example.demo.dao.service;

import com.lbs.example.demo.dao.repository.StudentRepository;
import com.lbs.example.demo.dao.service.base.IStudentDaoService;
import com.lbs.example.demo.domain.StudentDto;
import com.lbs.example.demo.entity.Student;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Erman.Kaygusuzer on 21/07/2022
 */

@Component
public class StudentDaoService implements IStudentDaoService {

	@Autowired
	private StudentRepository studentRepository;
	private ModelMapper mapper = new ModelMapper();

	@Override
	public StudentDto saveStudent(StudentDto studentDto) {
		Student student = mapper.map(studentDto, Student.class);
		return mapper.map(studentRepository.save(student), StudentDto.class);
	}
}
