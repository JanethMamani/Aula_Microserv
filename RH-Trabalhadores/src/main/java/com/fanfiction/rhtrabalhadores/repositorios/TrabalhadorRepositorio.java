package com.fanfiction.rhtrabalhadores.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fanfiction.rhtrabalhadores.entidades.Trabalhador;

public interface TrabalhadorRepositorio extends JpaRepository<Trabalhador, Long> {
	
	

}
