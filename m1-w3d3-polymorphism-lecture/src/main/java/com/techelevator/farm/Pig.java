package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends Animal {
	
	public Pig() { // create new pig constructor
		setPrice(new BigDecimal("10.00"));

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Pig";
	}

	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return "oink!";
	}

}
