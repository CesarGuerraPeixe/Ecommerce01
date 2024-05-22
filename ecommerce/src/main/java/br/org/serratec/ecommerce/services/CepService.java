package br.org.serratec.ecommerce.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.org.serratec.ecommerce.Dtos.RelatorioPedidoDTO;



@Service
public class CepService {
	public RelatorioPedidoDTO consultaid(String id) {
		RestTemplate restTemplate = new RestTemplate();
		String uri = "viacep.com.br/ws/01001000/json/";
		
		Map<String,String> params = new HashMap<String,String>();
		
		params.put("id", id);
		
		RelatorioPedidoDTO dto = restTemplate.getForObject(uri, RelatorioPedidoDTO.class, params);
		
		return dto;
	}	
}
