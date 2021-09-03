package com.qa.oop_principles;

public class Polymorphism_Goldfish extends Polymorphism_Fish{
	
	private String colour; 
	private int numberOfFins;
	
	public void noise() {
		System.out.println("Glub glub");
	}
	
	
	public Polymorphism_Goldfish(String colour, int numberOfFins) {
		super();
		this.colour = colour;
		this.numberOfFins = numberOfFins;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getNumberOfFins() {
		return numberOfFins;
	}


	public void setNumberOfFins(int numberOfFins) {
		this.numberOfFins = numberOfFins;
	}
	
	

}
