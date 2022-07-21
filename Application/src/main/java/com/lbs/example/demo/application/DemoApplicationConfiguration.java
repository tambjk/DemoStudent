package com.lbs.example.demo.application;

import com.lbs.example.demo.service.config.EnableService;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.PostConstruct;

/**
 * Created by Erman.Kaygusuzer on 21/07/2022
 */
@Configuration
@EnableService
@EnableWebMvc
public class DemoApplicationConfiguration {

	@PostConstruct
	private void init() {
		System.out.println("Application ready");
	}
}
