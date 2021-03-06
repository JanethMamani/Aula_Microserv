package com.fanfiction.rhtrabalhadores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RhTrabalhadoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhTrabalhadoresApplication.class, args);
	}

}
