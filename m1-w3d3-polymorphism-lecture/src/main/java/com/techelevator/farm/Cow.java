package com.techelevator.farm;

import java.math.BigDecimal;

public class Cow extends Animal {
	public Cow() {
		setPrice(new BigDecimal("65.00"));

	}

	@Override
	public String getName() {
		return "Cow";
	}

	@Override
	public String makeSound() {
		return "moo!";
	}
}