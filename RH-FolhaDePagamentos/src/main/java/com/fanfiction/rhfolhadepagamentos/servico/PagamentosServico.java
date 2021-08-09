package com.fanfiction.rhfolhadepagamentos.servico;

import org.springframework.stereotype.Service;

import com.fanfiction.rhfolhadepagamentos.entidades.Pagamentos;

@Service
public class PagamentosServico {
	
	public Pagamentos servPagamento(long trabalhadorId, int dias) {
		return new Pagamentos("X", 400.0, dias);
	}

}
