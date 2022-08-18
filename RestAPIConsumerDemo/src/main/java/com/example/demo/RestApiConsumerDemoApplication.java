package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ComponentScan({"com.example.processor,com.example.route, com.example.model"})
public class RestApiConsumerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiConsumerDemoApplication.class, args);
	}

}
