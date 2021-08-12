package com.fanfiction.rhservidorconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class RhServidorConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhServidorConfigurationApplication.class, args);
	}

}
