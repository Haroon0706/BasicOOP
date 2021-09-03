package com.qa.oop_principles;

public class Polymorphism_runner {
	
	
// Polymorphism - Objects belong to other objects in the chain
// Poly  - Many of
// Morph - Objects
// NOT the idea that EVERYTHING is an object
// The idea that all OBJECTS in java are objects of something else of something else.. etc..
		
// goldy is a GoldFish
// goldy is a Fish
// goldy is an Object 

// All objects created within Java are PolyMorphic because they are atleast 2 objects
		
		public static void main(String[] args) {
			
			// Goldy is a GoldFish!
			Polymorphism_Goldfish goldy = new Polymorphism_Goldfish("Golden", 3);
			goldy.noise();
			
			// goldy2 is a Fish!
			Polymorphism_Fish goldy2 = new Polymorphism_Goldfish("Sunset Orange", 2);
			((Polymorphism_Goldfish) goldy2).noise();
			
			// goldy3 is an Object
			Object goldy3 = new Polymorphism_Goldfish("Maroon", 4);
			((Polymorphism_Goldfish) goldy3).noise();
			
			// The GOldfish class / object IS polymorphic because it can take on many different objects
			
		}
		


}
