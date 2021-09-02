package com.qa.oop_principles;

public class Inheritance_runner {

	
	public static void main(String[] args) {

		// To create a goldfish out of goldfish class
		Inheritance_GoldFish newGoldFish = new Inheritance_GoldFish("Orange");

		System.out.println(newGoldFish.noise());
		newGoldFish.fishTraits();

		// Creating a new dolphin
		Inheritance_Dolphin newDolphin = new Inheritance_Dolphin(true);
		newDolphin.changeBreathing();
		System.out.println(newDolphin.noise());
		
	}
}
