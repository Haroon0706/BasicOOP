package com.qa.oop_principles;

public class Inheritance_Dolphin extends Inheritance_fish{

	public boolean eatenFish = true;
	
	
//	Dolphin class is inheriting the breathesOxygen variable
//	Is changing the value to be correct
		public void changeBreathing() {
			System.out.println(breathesOxygen);
			breathesOxygen = true;
			System.out.println(breathesOxygen);
		}
		
		
		/**
		 * @param eatenFish
		 */
		public Inheritance_Dolphin(boolean eatenFish) {
			super();
			this.eatenFish = eatenFish;
		}
	
		
}
