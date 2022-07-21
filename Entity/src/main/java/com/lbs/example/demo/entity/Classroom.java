package com.lbs.example.demo.entity;

import com.lbs.example.demo.entity.base.BaseEntity;

import javax.persistence.Entity;

/**
 * Created by Erman.Kaygusuzer on 21/07/2022
 */

@Entity
public class Classroom extends BaseEntity {

	private String title;
	private int seatCount;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
}
