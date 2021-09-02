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
		System.out.println(newCake.flavour + newCake.colour);
		System.out.println(newCake.sprinkles);
		
		System.out.println(newerCake.colour);
		
		newCake.cutInSlices();
		
		CakeTin constructedCake = new CakeTin("Blue", "Chocolate", 5, 25, true);
		
		constructedCake.cutInSlices();
		
		System.out.println(constructedCake.colour);
		
		CakeTin cake1 = new CakeTin("Brown", "Chocolate", 1, 25, true);
		CakeTin cake2 = new CakeTin("Pink", "Jam", 4, 12, true);
		cake1.cutInSlices();
		System.out.println(cake1.colour);
		System.out.println(cake2.colour);
		
		cake1.colour = "Purple";
		System.out.println(cake1.colour);
		System.out.println(cake2.colour);
		System.out.println(CakeTin.width);
		System.out.println(cake2.width);
		
		CakeTin.width = 15;
		cake1.width = 17;
		System.out.println(cake1.width);
		System.out.println(cake2.width);
		System.out.println(CakeTin.cakesMade);
		
		CakeTin cake3 = new CakeTin("Red", "Plain", 2, 10, false);
		CakeTin cake4 = new CakeTin("Yellow", "Strawberry", 5, 7, false);
		System.out.println(CakeTin.cakesMade);
		
//		A class cannot run an INSTANCED method
//		CakeTin.cutInSlices();
		
//		Both class and object can run a STATIC method
		
		CakeTin.cookCake();
		cake1.cookCake();
		
		
		
	}

}
