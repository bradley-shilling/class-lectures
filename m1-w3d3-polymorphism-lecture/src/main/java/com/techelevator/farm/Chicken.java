package com.techelevator.farm;

import java.math.BigDecimal;

public class Chicken extends Animal {
	
	public Chicken() {
		setPrice(new BigDecimal("3.50"));
	}
	
	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Chicken";
	}

	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return "cluck!";
	}

}