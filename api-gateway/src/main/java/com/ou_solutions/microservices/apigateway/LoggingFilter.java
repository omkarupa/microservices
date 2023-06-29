package com.ou_solutions.microservices.apigateway;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class LoggingFilter implements GlobalFilter {
	
	private Log log = LogFactory.getLog(getClass());

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		
		log.info(exchange.getRequest().getPath());
		log.info(exchange.getResponse().getStatusCode());
		// TODO Auto-generated method stub
		return chain.filter(exchange);
	}

}
