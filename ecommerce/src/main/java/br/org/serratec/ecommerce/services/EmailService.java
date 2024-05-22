package br.org.serratec.ecommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class EmailService {

	@Autowired
	public JavaMailSender emailSender;
	
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
					+ ex.getMessage());
		}
		
	}
}
