package br.org.serratec.ecommerce.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.org.serratec.ecommerce.dtos.CepDto;
import br.org.serratec.ecommerce.dtos.RelatorioPedidoDto;

@Service
public class CepService {
	public static CepDto consultacep(String cep) {
		RestTemplate restTemplate = new RestTemplate();
		String uri = "viacep.com.br/ws/json/";

		Map<String, String> params = new HashMap<String, String>();

		params.put("cep", cep);

		CepDto dto = restTemplate.getForObject(uri, CepDto.class, params);

		return dto;
	}
}
