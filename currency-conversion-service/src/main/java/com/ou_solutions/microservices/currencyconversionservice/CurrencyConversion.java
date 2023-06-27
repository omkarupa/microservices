package com.ou_solutions.microservices.currencyconversionservice;

import java.math.BigDecimal;



public class CurrencyConversion {
	
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private int quantity;
	private BigDecimal totalCalculatedCurrency;
	private String environment;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public BigDecimal getTotalCalculatedCurrency() {
		return totalCalculatedCurrency;
	}
	public void setTotalCalculatedCurrency(BigDecimal totalCalculatedCurrency) {
		this.totalCalculatedCurrency = totalCalculatedCurrency;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
