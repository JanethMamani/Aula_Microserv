package com.fanfiction.recursoshumanos.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tabela_trabalhador")

public class Trabalhador implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Double ganho;

public Trabalhador() {
	
}

public Trabalhador(Long id, String nome, Double ganho) {
	super();
	this.id = id;
	this.nome = nome;
	this.ganho = ganho;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Double getGanho() {
	return ganho;
}

public void setGanho(Double ganho) {
	this.ganho = ganho;
}

}