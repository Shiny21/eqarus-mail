package com.eqarus.sentiment.mail.handler;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.eqarus.sentiment.mail.bean.Mail;
import com.eqarus.sentiment.mail.service.MailService;

@Service
public class EqarusMailhandler implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
 
	@Autowired
	private MailService mailService;
	
@Override
public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent input) {
	
	String mailtobesent=input.getBody();
	APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();
	
	Mail mail = new Mail();
    mail.setMailFrom("nandkrish43@gmail.com");
    mail.setMailTo(mailtobesent);
    mail.setMailSubject("Eqarus Example");
    mail.setMailContent("Mail is up");

   try {
    mailService.sendEmail(mail);
    response.setStatusCode(200);
   }
   catch(Exception e) {
	   response.setBody(e.getMessage());
	   response.setStatusCode(500);   
   }
	return response;
}
}