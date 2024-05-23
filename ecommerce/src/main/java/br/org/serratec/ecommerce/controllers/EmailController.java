package br.org.serratec.ecommerce.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.ecommerce.services.EmailService;

@RestController
@RequestMapping("emails")
public class EmailController {
	
	
	public EmailController() {
		super();
	}

	@PostMapping
	public void enviarEmail(@RequestBody EmailService email) {
		System.out.println(email);
	}
	

}
