package com.ou_solutions.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {
	
	@Autowired
	CurrencyExchangeRepositoty exchangeRepositoty;
	
	public CurrencyExchange retriveCurrency(String from,String to)
	{
		return exchangeRepositoty.findByFromAndTo(from, to);
	}

}
