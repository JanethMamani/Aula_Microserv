package com.fanfiction.rhtrabalhadores.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fanfiction.rhtrabalhadores.entidades.Trabalhador;
import com.fanfiction.rhtrabalhadores.repositorios.TrabalhadorRepositorio;

@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorRecursos {
	
	@Autowired  //injeta as dependencias da classe 
	private TrabalhadorRepositorio repositorio;
	
	@GetMapping
	//Um metodo tipo response entity que retornara uma lista com trabalhadores
	public ResponseEntity<List<Trabalhador>> findAll() {
		List<Trabalhador> trabalhadores = repositorio.findAll();//O metoro do repositorio vai ate o banco de dados e devolve a lista que queremos
		return ResponseEntity.ok(trabalhadores);
	}
	
	@GetMapping(value = "/{numeroId}")
	public ResponseEntity<Trabalhador> findById(@PathVariable Long numeroId){
		Trabalhador pessoa = repositorio.findById(numeroId).get();
		return ResponseEntity.ok(pessoa);
	}

}
