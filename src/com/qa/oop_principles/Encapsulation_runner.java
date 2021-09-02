package com.qa.oop_principles;

public class Encapsulation_runner {
	
	public static void main(String[] args) {
		
		
		Encapsulation_fish goldFish = new Encapsulation_fish("Gold", "small fish", 4, 5, 3, true);
		System.out.println(goldFish.getColour());
		
		// Set the colour of gold fish to be maroon
		goldFish.setColour("Maroon");
		System.out.println(goldFish.getColour());
		
		// If I wanted to specify colour CANNOT be blue, can be done with setter
		goldFish.setColour("blue");
		System.out.println(goldFish.getColour());
		
		goldFish.setSize(-3);
		
	}

}
