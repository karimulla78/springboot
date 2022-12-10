package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println(".....Welcome to Springboot.............");
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RequestMapping("/boot")
	public String hello() {
		 return "Hello !!! Welcome to main";
	}

}
