package com.lbs.example.demo.domain;

import com.lbs.example.demo.domain.base.BaseDto;

/**
 * Created by Erman.Kaygusuzer on 21/07/2022
 */
public class StudentDto extends BaseDto {

	private String name;
	private String surname;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
