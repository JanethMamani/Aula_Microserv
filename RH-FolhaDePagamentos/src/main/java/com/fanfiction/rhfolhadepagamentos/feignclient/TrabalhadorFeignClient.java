package com.fanfiction.rhfolhadepagamentos.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fanfiction.rhfolhadepagamentos.entidades.Trabalhador;

@Component
@FeignClient(name = "RH-Trabalhadores", path = "/trabalhadores")
public interface TrabalhadorFeignClient {
	
	@GetMapping(value = "/{id}")
	ResponseEntity<Trabalhador> findById(@PathVariable Long id);

}
