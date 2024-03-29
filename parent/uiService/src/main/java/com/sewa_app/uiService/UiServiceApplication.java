package com.sewa_app.uiService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UiServiceApplication.class, args);
	}

}
