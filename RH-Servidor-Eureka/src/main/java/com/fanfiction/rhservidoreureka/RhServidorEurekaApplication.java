package com.fanfiction.rhservidoreureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RhServidorEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhServidorEurekaApplication.class, args);
	}

}
