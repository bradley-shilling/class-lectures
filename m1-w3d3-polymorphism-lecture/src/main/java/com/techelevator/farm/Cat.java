package com.techelevator.farm;

import java.math.BigDecimal;

public final class Cat extends Animal {
	public Cat() {
		setPrice(new BigDecimal("65.00"));
		

	}
	@Override
	public String getName() {
		return "Cat";
	}

	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return "meooooooooow!";
	}
	
	
}