package com.fanfiction.rhfolhadepagamentos.entidades;

import java.io.Serializable;

public class Pagamentos implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Double ganhoDiario;
	private Integer dias;
	
	public Pagamentos() {
		
	}

	public Pagamentos(String nome, Double ganhoDiario, Integer dias) {
		super();
		this.nome = nome;
		this.ganhoDiario = ganhoDiario;
		this.dias = dias;
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

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}
	
	public double getTotal() {//PRECISA SER GET Obrigatoriamente
		return dias * ganhoDiario;
	}

}
