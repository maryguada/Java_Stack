package com.objectmasterone.human;

public class WizardTest extends Human {
	
	public static void main (String[]  args) {
		Wizard Mary = new Wizard(); 
		Wizard Meg = new Wizard(); 
		
		Mary.heal(Meg); 
		Meg.fireball(Mary);	
		
	}

}
