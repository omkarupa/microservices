package com.ou_solutions.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	CurrencyExchangeService exchangeService;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveCurrency(@PathVariable String from,@PathVariable String to)
	{
		CurrencyExchange currencyExchange = exchangeService.retriveCurrency(from, to);
		currencyExchange.setEnvironment(environment.getProperty("local.server.port"));
		return currencyExchange;
	}

}
