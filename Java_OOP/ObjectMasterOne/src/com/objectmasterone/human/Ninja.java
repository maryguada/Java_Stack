package com.objectmasterone.human;

public class Ninja extends Human {
	
	// declare variables. set default to 10; 
	int stealth = 10; 
	
	// create your methods 
	public void runAway(Human human) {
		human.health -= 10; 
		System.out.println("After running away, ninja health is now at: " + human.health);
	}
	// create your methods 
	public void steal(Human human) {
		human.health -= this.stealth; 
		this.health += this.stealth; 
		System.out.println("You've stolen from another player, other ninja is now at " +human.health );
	}


}
