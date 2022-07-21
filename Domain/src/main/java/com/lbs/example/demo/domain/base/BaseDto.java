package com.lbs.example.demo.domain.base;

import java.io.Serializable;

/**
 * Created by Erman.Kaygusuzer on 21/07/2022
 */
public abstract class BaseDto implements Serializable {

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
