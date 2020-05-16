package com.eqarus.sentiment.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eqarus.sentiment.mail.bean.Mail;
import com.eqarus.sentiment.mail.service.MailService;

@RestController
public class MailController {
	
	@Autowired
	private MailService mailService;
	
	@GetMapping("/mail")
	public void getMail() {
		
		Mail mail = new Mail();
        mail.setMailFrom("nandkrish43@gmail.com");
        mail.setMailTo("nandkrish43@gmail.com");
        mail.setMailSubject("Eqarus Example");
        mail.setMailContent("Mail is up");
 
       
        mailService.sendEmail(mail);
		
		
		
	}

}
