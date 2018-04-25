package com.techelevator.farm;

import java.math.BigDecimal;
import java.util.Random;

public class Nuke extends Animal {
	
	public Nuke() { // create new constructor
		setPrice(new BigDecimal("100.00"));
	}

	@Override
	public String getName() {
		return "Duke Nukem";
	}

	@Override
	public String makeSound() {
		String[] list = {"Looks like it's time for me to go postal!", "I'm gonna put the smack dab on your ass!", "Nobody steals our chicks... and lives!", "I should have known those alien maggots booby-trapped this sub.", "It's time to kick ass and chew bubble gum, and I'm all outta gum!"};
		Random r = new Random();
		return list[r.nextInt(list.length)];
	}

}
