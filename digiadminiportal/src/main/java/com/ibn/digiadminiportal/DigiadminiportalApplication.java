package com.ibn.digiadminiportal;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DigiadminiportalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigiadminiportalApplication.class, args);
	}

	@Bean 
	public RestTemplate getRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return  restTemplate;
		
	}
}
