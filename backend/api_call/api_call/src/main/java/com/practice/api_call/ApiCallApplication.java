package com.practice.api_call;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCallApplication.class, args);
	}

}
