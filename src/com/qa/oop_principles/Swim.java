package com.qa.oop_principles;

public interface Swim {
	
// Best practice that each interface contains one method
// This way if one class requires two distinct interfaces and not another, you're not adding unnecessary code
	
	void swim();

}
