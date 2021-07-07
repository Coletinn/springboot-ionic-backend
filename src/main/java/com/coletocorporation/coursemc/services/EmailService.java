package com.coletocorporation.coursemc.services;

import org.springframework.mail.SimpleMailMessage;

import com.coletocorporation.coursemc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
