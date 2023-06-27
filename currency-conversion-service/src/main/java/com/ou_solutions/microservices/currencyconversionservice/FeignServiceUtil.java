package com.ou_solutions.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "currency-exchange",url = "http://localhost:8000/")
public interface FeignServiceUtil {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retriveCurrency(@PathVariable String from,@PathVariable String to);
	
}