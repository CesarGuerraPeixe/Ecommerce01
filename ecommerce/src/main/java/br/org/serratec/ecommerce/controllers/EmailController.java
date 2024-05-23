package br.org.serratec.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.ecommerce.dtos.RelatorioPedidoDTO;
import br.org.serratec.ecommerce.services.EmailService;

@RestController
@RequestMapping("emails")
public class EmailController {
	
	@Autowired
	EmailService emailService;
	public EmailController() {
		super();
	}

	
	}
	


