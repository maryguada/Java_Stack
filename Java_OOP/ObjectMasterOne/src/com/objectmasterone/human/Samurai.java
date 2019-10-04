package com.objectmasterone.human;

public class Samurai extends Human {
	
	// declare variables here 
	static int totalSamurai = 0; 
	int health = 200; 
	
	
	// create methods here 
	public Samurai() {
		totalSamurai += 1 ; 
	}
	
	public void deathBlow(Human human) {
		//reduce health by 1/2 
		human.health = 0;
		this.health = this.health/2; 
		System.out.println("You have used deathblow, their health is now reduced by half. Helth:" + this.health); 
	}
	
	public void meditate() {
		this.health += (this.health /2);
		System.out.println("You've meditated, health: " + this.health);
	}
	
	public void howMany() {
		System.out.println("There are " + Samurai.totalSamurai + " Samurai's");
	}
}

