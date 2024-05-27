package br.org.serratec.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.ecommerce.dtos.CepDto;
import br.org.serratec.ecommerce.dtos.EnderecoDto;
import br.org.serratec.ecommerce.services.CepService;

@RestController 
@RequestMapping ("/endereco")
public class CepController{
	

@Autowired
CepService cepService;

@GetMapping("/consulta")
public ResponseEntity<CepDto> consultacep(@RequestBody String cep) {
	
	return new 
			ResponseEntity<>(CepService.consultacep(cep), HttpStatus.OK);
	
}


@PostMapping("/enviar-endereco")
public CepDto obterEndereco(@RequestBody EnderecoDto enderecoDto) {
    return cepService.consultacep(enderecoDto.getCep());
}


}
