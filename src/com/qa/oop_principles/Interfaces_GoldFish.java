package com.qa.oop_principles;

//	Primary class starting with is the more specific type of fish

//	Interfaces - A completely abstract class only containing methods with empty bodies
//	No need to specify the empty methods as abstract, they're all abstract by default

// 	Previously to use the abstract class, needed to use EXTEND
//	Drawback with abstract classes is you can only EXTEND one class

//	With interfaces, use the IMPLEMENTS keyword instead
//	With interfaces, multiple interfaces can be implemented at the same time

public class Interfaces_GoldFish implements Interfaces_Fish{
	
	private String name;

	public void sleep() {
		System.out.println("Sleeping!");
		
	}

	public void noise() {
		System.out.println("Glub Glug Glub");
		
	}

	public void swim() {
		System.out.println("Swimming across the tank :) ");
		
	}

	public Interfaces_GoldFish(String name) {
		super();
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
//	Not BEST PRACTICE as there is more than one method in this interface
//	Refer to Jellyfish for better practice
	
	
}
