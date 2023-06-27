package com.ou_solutions.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepositoty extends JpaRepository<CurrencyExchange, Long> {
	
	
	public CurrencyExchange findByFromAndTo(String from,String to);

}
