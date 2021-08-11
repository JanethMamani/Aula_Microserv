package com.fanfiction.rhfolhadepagamentos.recursos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fanfiction.rhfolhadepagamentos.entidades.Pagamentos;
import com.fanfiction.rhfolhadepagamentos.servico.PagamentosServico;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentosRecursos {
	
	@Autowired
	private PagamentosServico servico;
	
	@HystrixCommand(fallbackMethod = "getPagosAternativo")
	@GetMapping(value = "/{trabalhadorId}/dias/{dias}")
	public ResponseEntity<Pagamentos> getPagamento(@PathVariable Long trabalhadorId, @PathVariable Integer dias){
		Pagamentos pagamento = servico.servPagamento(trabalhadorId, dias);
		return ResponseEntity.ok(pagamento);
	}
	
	public ResponseEntity<Pagamentos> getPagosAternativo(Long trabalhadorId, Integer dias){
		Pagamentos solucaoMock = new Pagamentos("Sherlock", 200.0, dias);//Aqui podia colocar outra coisa no caso do servidor fora do ar
		return ResponseEntity.ok(solucaoMock);
	}

}
