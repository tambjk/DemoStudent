package com.lbs.example.demo.dao.config;

import com.lbs.example.demo.entity.config.EnableEntity;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;

/**
 * Created by Erman.Kaygusuzer on 21/07/2022
 */
@Configuration
@EnableEntity
@ComponentScan(basePackages = "com.lbs.example.demo.dao")
@EnableJpaRepositories(basePackages = "com.lbs.example.demo.dao.repository")
public class DaoConfig {

	@PostConstruct
	private void init() {
		System.out.println("Dao Layer initialized");
	}
}
