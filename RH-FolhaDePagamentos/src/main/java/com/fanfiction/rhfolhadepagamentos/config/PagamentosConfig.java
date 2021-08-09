package com.fanfiction.rhfolhadepagamentos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class PagamentosConfig {
	
	@Bean
	public RestTemplate registreRestTemplate() {
		return new RestTemplate();//Padrão Singleton - Instância única
		
	}

}
