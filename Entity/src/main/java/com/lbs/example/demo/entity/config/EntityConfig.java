package com.lbs.example.demo.entity.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by Erman.Kaygusuzer on 21/07/2022
 */
@Configuration
@EntityScan(basePackages = "com.lbs.example.demo.entity")
public class EntityConfig {

	@PostConstruct
	private void init() {
		System.out.println("Entity Layer initialized");
	}
}
