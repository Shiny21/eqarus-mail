package com.eqarus.sentiment.mail;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

// @formatter:on


public class SpringBootLambdaHandler extends SpringBootRequestHandler<APIGatewayProxyRequestEvent, 
APIGatewayProxyResponseEvent>{

}
