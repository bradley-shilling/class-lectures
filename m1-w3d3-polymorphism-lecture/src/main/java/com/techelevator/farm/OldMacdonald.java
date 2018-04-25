package com.techelevator.farm;

import java.awt.datatransfer.FlavorListener;
import java.math.BigDecimal;

public class OldMacdonald {
	public static void main(String[] args) {
		
		Cow bessie = new Cow();
		Chicken frank = new Chicken();
		Pig babe = new Pig();
		Cat roy = new Cat();
		babe.setSleeping(true);
		Nuke duke = new Nuke();
		roy.setSleeping(true);
		
		Tractor clarance = new Tractor();
		
		Apple apple = new Apple();
		
		
		Singable[] listOfSingables = { bessie, frank, babe, clarance, roy, duke }; // create list of singable items
		
		for(Singable thisSingThing : listOfSingables) {
			String name = thisSingThing.getName();
			String sound = thisSingThing.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a "+name+", ee, ay, ee, ay, oh!");
			System.out.println("With a "+sound+" "+sound+" here");
			System.out.println("And a "+sound+" "+sound+" there");
			System.out.println("Here a "+sound+" there a "+sound+" everywhere a "+sound+" "+sound);
			System.out.println();
		}
		
		Sellable[] listOfSellables = { bessie, frank, babe, apple }; // create list of singable items
		
		for(Sellable thingsForSale : listOfSellables) {
			String name = thingsForSale.getName();
			BigDecimal price = thingsForSale.getPrice();
			if (price != null) {
				System.out.println("We have a " + name + " for sale!");
				System.out.println("Only $" + price);
				System.out.println();
			}
			
		}
	}
}