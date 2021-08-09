package com.fanfiction.rhfolhadepagamentos.recursos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fanfiction.rhfolhadepagamentos.entidades.Pagamentos;
import com.fanfiction.rhfolhadepagamentos.servico.PagamentosServico;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentosRecursos {
	
	@Autowired
	private PagamentosServico servico;
	
	@GetMapping(value = "/{trabalhadorId}/dias/{dias}")
	public ResponseEntity<Pagamentos> getPagamento(@PathVariable Long trabalhadorId, @PathVariable Integer dias){
		Pagamentos pagamento = servico.servPagamento(trabalhadorId, dias);
		return ResponseEntity.ok(pagamento);
	}

}
