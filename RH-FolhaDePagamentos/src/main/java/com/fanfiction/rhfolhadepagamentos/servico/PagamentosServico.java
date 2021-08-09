package com.fanfiction.rhfolhadepagamentos.servico;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fanfiction.rhfolhadepagamentos.entidades.Pagamentos;
import com.fanfiction.rhfolhadepagamentos.entidades.Trabalhador;

@Service
public class PagamentosServico {
	
	@Value("${rh-trabalhadores.host}")
	private String trabalhadorHost;
	
	@Autowired
	private RestTemplate metodosRest;
	
	
	public Pagamentos servPagamento(long trabalhadorId, int dias) {
		Map<String, String> siteEntry = new HashMap<>();
		siteEntry.put("id", "" + trabalhadorId);
		
		Trabalhador pessoa = metodosRest.getForObject(trabalhadorHost + "/trabalhadores/{id}", Trabalhador.class, siteEntry);
		return new Pagamentos(pessoa.getNome(), pessoa.getGanhoDiario(), dias);
		//return new Pagamentos("X", 400.0, dias); //Dado mockados ou por hard code
		
	}

}
