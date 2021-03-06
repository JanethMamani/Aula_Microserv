package com.fanfiction.rhtrabalhadores.recursos;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fanfiction.rhtrabalhadores.entidades.Trabalhador;
import com.fanfiction.rhtrabalhadores.repositorios.TrabalhadorRepositorio;

@RefreshScope //Emtodas as classes que mexerem na configuração, profiles, etc..
@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorRecursos {
	
	private static Logger verPortaLogg = LoggerFactory.getLogger(TrabalhadorRecursos.class);
	
	@Value(value = "${safira.config}")//Como pode ver, aqui mexeu nas configs
	private String safiraConfig;
	
	@Autowired
	private Environment envir;
	
	@Autowired  //injeta as dependencias da classe 
	private TrabalhadorRepositorio repositorio;
	
	@GetMapping(value = "/configs")
	public ResponseEntity<Void> getConfigs(){
		verPortaLogg.info("CONFIG = " + safiraConfig);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping
	//Um metodo tipo response entity que retornara uma lista com trabalhadores
	public ResponseEntity<List<Trabalhador>> findAll() {
		List<Trabalhador> trabalhadores = repositorio.findAll();//O metoro do repositorio vai ate o banco de dados e devolve a lista que queremos
		return ResponseEntity.ok(trabalhadores);
	}
	
	@GetMapping(value = "/{numeroId}")
	public ResponseEntity<Trabalhador> findById(@PathVariable Long numeroId){
		
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException excecao) {
			excecao.printStackTrace();
		}
		
		verPortaLogg.info("PORT = " + envir.getProperty("local.server.port"));
		
		Trabalhador pessoa = repositorio.findById(numeroId).get();
		return ResponseEntity.ok(pessoa);
	}

}
