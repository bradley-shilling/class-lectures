package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaintCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//create list of wall objects entered by user
		List<Wall> allTheWalls = new ArrayList<>();
		
		while(true) {
			
			System.out.println();
			System.out.println("[1] Add a wall");
			System.out.println("[2] Calculate paint required (and Exit)");
			System.out.print("Please choose >>> ");
			String userChoice = scan.nextLine();
			
			System.out.println();
			
			if(userChoice.equals("1")) {
				
				System.out.print("Enter wall height >>> ");
				int height = Integer.parseInt(scan.nextLine());
				System.out.print("Enter wall width >>> ");
				int width = Integer.parseInt(scan.nextLine());
				
				Wall enteredWall = new Wall(height, width); // create new wall object with values from  height and width
				allTheWalls.add(enteredWall); // add created object to list of walls
				
				System.out.println("Added "+ enteredWall +" wall - "+enteredWall.getArea()+" square feet."); // returns variables from created wall object
				
			} else if(userChoice.equals("2")) {
				
				// Here we need to sum up the areas of all walls that have been entered
				for(int i = 0; i < allTheWalls.size(); i++) {
					Wall currentWall = allTheWalls.get(i); // store current wall as temp var
				System.out.println("Wall " + (i + 1) + ": " + currentWall + " - " + currentWall.getArea() + " square feet."); //concatinate instance variables into string and print
				}
				
				int totalArea = 0; // sets up total area variable
				for (Wall currentWall : allTheWalls) { // goes through each wall and adds area to total area
					totalArea += currentWall.getArea();
				}
				
				// prints results of total area
				System.out.println("===============================");
				System.out.println("Total Area: "+totalArea+" square feet.");
				
				// 1 gallon of paint covers 400 square feet
				float gallonsRequired = (float)totalArea / 400;
				System.out.println("Paint Required: "+gallonsRequired+" gallons");
				
				System.exit(0); // Causes the program to end
			}
		}
	}

}
