package com.eqarus.sentiment.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
@SpringBootApplication
@ComponentScan({"com.eqarus.sentiment.mail.EqarusSentimentMailApplicationTest"})
public class EqarusSentimentMailApplication {

	public static void main(String[] args) {
		SpringApplication.run(EqarusSentimentMailApplication.class, args);
	}
	
	 @Autowired
	    private Environment env;
	 
	    @Bean
	    public JavaMailSender getMailSender() {
	        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
	 
	        mailSender.setHost(env.getProperty("spring.mail.host"));
	        mailSender.setPort(Integer.valueOf(env.getProperty("spring.mail.port")));
	        mailSender.setUsername(env.getProperty("spring.mail.username"));
	        mailSender.setPassword(env.getProperty("spring.mail.password"));
	 
	        Properties javaMailProperties = new Properties();
	        javaMailProperties.put("mail.smtp.starttls.enable", "true");
	        javaMailProperties.put("mail.smtp.auth", "true");
	        javaMailProperties.put("mail.transport.protocol", "smtp");
	        javaMailProperties.put("mail.debug", "true");
	        javaMailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	 
	        mailSender.setJavaMailProperties(javaMailProperties);
	        return mailSender;
	    }

}
