package com.fanfiction.rhtrabalhadores.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_trabalhador")
public class Trabalhador implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Double ganhoDiario;
	
	public Trabalhador() {
		
	}

	public Trabalhador(Long id, String nome, Double ganhoDiario) {
		super();
		this.id = id;
		this.nome = nome;
		this.ganhoDiario = ganhoDiario;
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

	public Double getGanhoDiario() {
		return ganhoDiario;
	}

	public void setGanhoDiario(Double ganhoDiario) {
		this.ganhoDiario = ganhoDiario;
	}
	

}
