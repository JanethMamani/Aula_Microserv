package com.fanfiction.rhfolhadepagamentos.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fanfiction.rhfolhadepagamentos.entidades.Pagamentos;
import com.fanfiction.rhfolhadepagamentos.entidades.Trabalhador;
import com.fanfiction.rhfolhadepagamentos.feignclient.TrabalhadorFeignClient;

@Service
public class PagamentosServico {
	
	/*//Do Rest Template associado no aplication properties
	@Value("${rh-trabalhadores.host}")
	private String trabalhadorHost;
	
	@Autowired//Para usar o Rest Template
	private RestTemplate metodosRest;*/
	
	@Autowired
	private TrabalhadorFeignClient clienteFeign;
	
	
	public Pagamentos servPagamento(long trabalhadorId, int dias) {
		//return new Pagamentos("X", 400.0, dias); //Dado mockados ou por hard code
		
		/*Map<String, String> siteEntry = new HashMap<>();
		siteEntry.put("id", "" + trabalhadorId);
		Trabalhador pessoa = metodosRest.getForObject(trabalhadorHost + "/trabalhadores/{id}", Trabalhador.class, siteEntry);*/
		
		Trabalhador pessoa = clienteFeign.findById(trabalhadorId).getBody();
		return new Pagamentos(pessoa.getNome(), pessoa.getGanhoDiario(), dias);
		
	}

}
