package com.ou_solutions.microservices.apigateway;

import java.util.function.Function;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {
	
	@Bean
	public RouteLocator getwayLocator(RouteLocatorBuilder builder)
	{
		return builder.routes()
				.route(p -> p.path("/currency-conversion/**").uri("lb://currency-conversion"))
				.route(p -> p.path("/currency-exchange/**")
						.filters(f -> f.rewritePath(
								"/currency-exchange/(?<segment>.*)",
								"/currency-conversion/${segment}"))
						.uri("lb://currency-conversion"))
				.build();
				
	}
	

}
