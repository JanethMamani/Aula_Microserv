package com.fanfiction.rhfolhadepagamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name = "RH-Trabalhadores")
@EnableFeignClients
@SpringBootApplication
public class RhFolhaDePagamentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhFolhaDePagamentosApplication.class, args);
	}

}
