package com.lbs.example.demo.service.config;

import com.lbs.example.demo.dao.config.EnableDao;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by Erman.Kaygusuzer on 21/07/2022
 */
@Configuration
@ComponentScan(basePackages = "com.lbs.example.demo.service")
@EnableDao
public class ServiceConfig {

	@PostConstruct
	private void init() {
		System.out.println("Service Layer initialized");
	}
}
