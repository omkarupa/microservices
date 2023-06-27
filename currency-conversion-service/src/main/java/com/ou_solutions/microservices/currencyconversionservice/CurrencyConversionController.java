package com.ou_solutions.microservices.currencyconversionservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	FeignServiceUtil serviceUtil;
	
	@GetMapping("currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion retriveCurrencyData(@PathVariable String from,@PathVariable String to,@PathVariable int quantity)
	{
		CurrencyConversion currencyConversion = serviceUtil.retriveCurrency(from, to);
		currencyConversion.setQuantity(quantity);
		
		currencyConversion.setTotalCalculatedCurrency(currencyConversion.getConversionMultiple().multiply(BigDecimal.valueOf(quantity)));
		
		return currencyConversion;
	}

}
