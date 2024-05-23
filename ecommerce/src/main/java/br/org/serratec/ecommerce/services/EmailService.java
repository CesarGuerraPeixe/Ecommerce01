package br.org.serratec.ecommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import br.org.serratec.ecommerce.dtos.RelatorioPedidoDto;
@Service
public class EmailService {

	@Autowired
	public JavaMailSender emailSender;
	
	
	
	@Async
	
	public void enviarEmail(String destinatario, String assunto, String mensagem) {
		var mailMessage = new SimpleMailMessage();
		
		mailMessage.setTo(destinatario);
		mailMessage.setSubject(assunto);
		mailMessage.setText(mensagem);
		mailMessage.setFrom("enzo.front17@gmail.com");
		
		try {
			emailSender.send(mailMessage);
		}catch(Exception ex) {
			System.out.println("Ocorreu um erro ao tentar enviar o e-mail: " 
					+ ex.getMessage());}
		}



	public boolean enviarEmail(RelatorioPedidoDto relatorioPedidoDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	
		
		
				
		
		
	}

