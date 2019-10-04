package com.zookeeper.mammal;

public class Bat extends Mammal {
	int energyLevel = 300; 
	
	public int fly() {
		this.energyLevel -= 50; 
		System.out.println("Flapping Away, Far Far Away"); 
		return this.energyLevel; 
	}
	
	public int eatHuman() {
		this.energyLevel += 25; 
		System.out.println("Bat is eating human!"); 
		return this.energyLevel; 	
	}
	
	public int attackTown() {
		this.energyLevel -= 100; 
		System.out.println("Attack Town!!"); 
		return this.energyLevel; 
	}
	

}
