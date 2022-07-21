package com.lbs.example.demo.entity;

import com.lbs.example.demo.entity.base.BaseEntity;

import javax.persistence.Entity;

/**
 * Created by Erman.Kaygusuzer on 21/07/2022
 */
@Entity
public class Student extends BaseEntity {

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
