package com.lbs.example.demo.domain;

import com.lbs.example.demo.domain.base.BaseDto;

/**
 * Created by Erman.Kaygusuzer on 21/07/2022
 */
public class ClassroomDto extends BaseDto {

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
