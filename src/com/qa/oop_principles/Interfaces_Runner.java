package com.qa.oop_principles;

public class Interfaces_Runner {
	
	public static void main(String[] args) {
		
		Interfaces_GoldFish goldy = new Interfaces_GoldFish("goldy");
		Interfaces_Jellyfish steven = new Interfaces_Jellyfish("steven");
		
		goldy.noise();
		steven.swim();
		goldy.sleep();
		steven.sleep();
		
		// Exercise - Using an existing / new animal class
		// Create at least 3 interfaces using existing methods (sleep, swim, eat..) 
		// Implement those interfaces on at least 2 different animal classes
		
	}

}
