package com.lbs.example.demo.service.rest;

import com.lbs.example.demo.domain.StudentDto;
import com.lbs.example.demo.service.base.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Erman.Kaygusuzer on 21/07/2022
 */
@RestController
@RequestMapping(value = "api/student")
public class StudentRestController implements IStudentService {

	@Autowired
	private IStudentService studentService;

	@Override
	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = "application/json")
	public StudentDto saveStudent(@RequestBody StudentDto studentDto) {
		return studentService.saveStudent(studentDto);
	}
}
