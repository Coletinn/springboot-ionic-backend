package com.coletocorporation.coursemc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.coletocorporation.coursemc.services.DBService;
import com.coletocorporation.coursemc.services.EmailService;
import com.coletocorporation.coursemc.services.MockEmailService;
import com.coletocorporation.coursemc.services.SmtpEmailService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		
		dbService.instantiateTestDatabase();
		return true;
	}

	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
}
