package com.qa.basic;

public class Runner {
	
	public static void main(String[] args) {
		
		
//		String is a complex object
		String newString = "This is new";
		
//		Objects are complex objects
//		CakeTin is the data type
//		newCake is the name of the new object
//		new CakeTin() is running the new method (Creating a new cake)
		CakeTin newCake = new CakeTin();
		CakeTin newerCake = new CakeTin("Green");
		System.out.println(newCake);
		System.out.println(newCake.flavour);
		System.out.println(newCake.sprinkles);
		
		System.out.println(newerCake.colour);
		
		newCake.cutInSlices();
	}

}
