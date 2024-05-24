package br.org.serratec.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.ecommerce.dtos.RelatorioPedidoDto;
import br.org.serratec.ecommerce.services.EmailService;

@RestController
@RequestMapping("emails")
public class EmailController {

	@Autowired
	EmailService emailService;

	public EmailController() {
		super();
	}

	@PostMapping("/enviar")
	public ResponseEntity<String> sendEmail(@RequestBody RelatorioPedidoDto relatorioPedidoDTO) {
		boolean isSent = emailService.enviarEmail(relatorioPedidoDTO);
		if (isSent) {
			return new ResponseEntity<>("Email enviado com sucesso!", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Falha ao enviar email.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
