package com.fanfiction.rhfolhadepagamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient // já inclui a annotation @RibbonClient(name = "RH-Trabalhadores") nas funções
@EnableFeignClients
@SpringBootApplication
public class RhFolhaDePagamentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhFolhaDePagamentosApplication.class, args);
	}

}
