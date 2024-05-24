package br.org.serratec.ecommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import br.org.serratec.ecommerce.dtos.RelatorioPedidoDto;
import br.org.serratec.ecommerce.exception.EmailSendException;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

	@Autowired
	public JavaMailSender emailSender;

	public EmailService(JavaMailSender emailSender) {
		this.emailSender = emailSender;
	}

	@Async

	/*
	 * public void enviarEmail(String destinatario, String assunto, String mensagem)
	 * { var mailMessage = new SimpleMailMessage();
	 * 
	 * mailMessage.setTo(destinatario); mailMessage.setSubject(assunto);
	 * mailMessage.setText(mensagem); mailMessage.setFrom("enzo.front17@gmail.com");
	 * 
	 * try { emailSender.send(mailMessage); } catch (Exception ex) {
	 * System.out.println("Ocorreu um erro ao tentar enviar o e-mail: " +
	 * ex.getMessage()); } }
	 */
	public void enviarEmail(String destinatario, String assunto, String conteudo) {
		MimeMessage mensagem = emailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mensagem);

		try {
			helper.setTo(destinatario);
			helper.setSubject(assunto);
			helper.setText(conteudo, true);
			emailSender.send(mensagem);
		} catch (MessagingException e) {
			throw new EmailSendException("Erro ao enviar o email para " + destinatario, e);
		}
	}

	public boolean enviarEmail(RelatorioPedidoDto relatorioPedidoDTO) {
		return false;
	}

}
