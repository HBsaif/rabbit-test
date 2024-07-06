package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitTestApplication.class, args);
		System.out.println("Running...");
	}

}
