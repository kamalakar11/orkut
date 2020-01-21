package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.controllers")
public class OrkutApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrkutApplication.class, args);
		System.out.println("Helo");
	}

}
