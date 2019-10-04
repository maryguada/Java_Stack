package com.objectmasterone.human;

public class Human {
	// add the following attributes with a default of 3 
	public int strength = 3; 
	public int stealth = 3; 
	public int intelligence = 3; 
	
	//add health attribute with a default of 100; 
	public int health = 100; 
	
	
	
	public void attack(Human Human) {
		Human.health -= this.strength;
		System.out.println("You have attacked another human.");
		System.out.println("Health: " + this.health + ", Opponent's Health: " + Human.health);
		
	} 
		

}
