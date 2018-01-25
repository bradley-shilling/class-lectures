package com.techelevator;

public class Wall {
	
	//define instance variables && access modifiers
	private int height;
	private int width;
	
	//default constructor
	/*
	public Wall() {
		
	};
	*/
	
	// custom constructor - rectangular wall
	public Wall(int height, int width) {
		this.height = height;
		this.width = width;
	};
	
	//new method
	public int getArea() {
		return height * width;
	};
	
	//getters and setters
	public void setHeight (int height) { //setter
		if (height > 0) {
			this.height = height;
		}
	}
	public int getHeight () { //getter
		return this.height;
	}
	public int getWidth() { //getter
		return width;
	}
	public void setWidth(int width) { //setter
		if (width > 0) {
			this.width = width;
		}
	}
	
	// to string method
	public String toString() {
		return height + "x" + width;
	}
	
	// to equals method
	public boolean equals(Object otherObject) { // get object
		if( ! (otherObject instanceof Wall)) { // compare object to wall
			return false;
		} else {
			Wall otherWall = (Wall)otherObject; // cast other object into wall with variable name otherWall
			if(otherWall.getWidth() == width && otherWall.getHeight() == height) { // compare width and height of current wall with other wall
				return true; // return true if same size
			} else {
				return false; // return false if not
			}
		}
	}
	

}
