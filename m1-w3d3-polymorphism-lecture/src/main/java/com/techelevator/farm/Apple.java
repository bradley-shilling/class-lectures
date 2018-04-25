package com.techelevator.farm;

import java.math.BigDecimal;

public class Apple implements Sellable {
	private String name = "Apple";
	private BigDecimal price = new BigDecimal("0.50");
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
