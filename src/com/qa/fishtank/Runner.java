package com.qa.fishtank;

// Role of this class is to run the application
// Create some fish, add the fish to the tank

public class Runner {
	
	public static void main(String[] args) {
		
		
//		First thing to within my runner is create a new Fish Tank object
		
		FishTank fishTank = new FishTank();
		
		
//		Fish objects
		
		GoldFish fish1 = new GoldFish("Hazy Orange", "Percy", 3, false);
		GoldFish fish2 = new GoldFish("Dull Gold", "Kelly", 4, false);
		GoldFish fish3 = new GoldFish("Maroon", "Maroon 5", 4, false);
		
		
//		Add fish1 to the tank
		fishTank.addToTank(fish1);
		fishTank.addToTank(fish2);
		fishTank.addToTank(fish3);
		
		
//		Accessing the fishtank array within the fishtank
			System.out.println(fishTank.fishTank);
		
			
//		Method listName being used on the array fishTank
		fishTank.listName();
		
	}

}
