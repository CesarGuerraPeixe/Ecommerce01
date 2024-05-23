package br.org.serratec.ecommerce.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.org.serratec.ecommerce.dtos.RelatorioPedidoDto;

@Service
public class CepService {
	public RelatorioPedidoDto consultaid(String id) {
		RestTemplate restTemplate = new RestTemplate();
		String uri = "viacep.com.br/ws/json/";

		Map<String, String> params = new HashMap<String, String>();

		params.put("id", id);

		RelatorioPedidoDto dto = restTemplate.getForObject(uri, RelatorioPedidoDto.class, params);

		return dto;
	}
}
