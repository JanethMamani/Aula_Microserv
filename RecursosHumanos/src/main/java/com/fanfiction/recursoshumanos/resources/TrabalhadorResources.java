package com.fanfiction.recursoshumanos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fanfiction.recursoshumanos.entidades.Trabalhador;
import com.fanfiction.recursoshumanos.repositories.TrabalhadorRepositorios;

//Disponibiliza os endpoints

@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorResources {
	
	@Autowired
	private TrabalhadorRepositorios arquivados;
	
	@GetMapping
	public ResponseEntity<List<Trabalhador>> findAll() {//Esse find All vai precisar retornar algo
		List<Trabalhador> trabalhadoresHunters = arquivados.findAll();
		return ResponseEntity.ok(trabalhadoresHunters);//Um ok foi retornado com a lista
	}
	
	@GetMapping(value = "/{numer}")//Cuidado com a vaRiAveL que vAi chamar aqui precisa ser a mesma aqui em baixo
	public ResponseEntity<Trabalhador> findById(@PathVariable Long numer) {
		Trabalhador newobjeto = arquivados.findById(numer).get();//Esse numer é na verdade da linha de cima, que foi gerado agora pouco do Id
		return ResponseEntity.ok(newobjeto);
	}

}
