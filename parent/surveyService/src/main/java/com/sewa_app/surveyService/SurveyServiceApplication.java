package com.sewa_app.surveyService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SurveyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurveyServiceApplication.class, args);
	}

}
