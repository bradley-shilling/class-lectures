package com.techelevator.farm;

import java.math.BigDecimal;

public abstract class Animal implements Singable, Sellable {
	private BigDecimal price;
	private boolean isSleeping;
	
	public abstract String getName();
	public abstract String makeSound();


	
	//logic in super class will be applied to information passed along from subclass
	public final String getSound( ) {//prevents subclasses from overwritting method
		if (isSleeping) {
			return"Zzzzzz...";
		} else {
		return makeSound();
		}
	}


	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public final boolean isSleeping() { // cant be overridden
		return isSleeping;
	}

	public final void setSleeping(boolean isSleeping) { // cant be overridden
		this.isSleeping = isSleeping;
	}
	
}