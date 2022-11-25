package com.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AwsDeployApplication {

	@GetMapping("/hello")
	public String hello() {
		return "Hello my is Zameer, and this app is running on aws" ;
	}
	public static void main(String[] args) {
		SpringApplication.run(AwsDeployApplication.class, args);
		System.out.println("Hello");
	}

}
