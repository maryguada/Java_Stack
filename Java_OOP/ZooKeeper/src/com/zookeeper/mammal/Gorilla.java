package com.zookeeper.mammal;

// create the Gorilla class that extends from Mammal class 
public class Gorilla extends Mammal {
	public Gorilla() {
		super(); 
	}
	
	public int throwSomething(int objects) {
		this.energyLevel -= 5 * objects; 
		System.out.println("Gorilla has thrown something at you"); 
		//display energy is coming from Mammal parent class
		System.out.println(this.displayEnergy()); 
		return this.displayEnergy(); 
	}
	
	
	public int eatBananas(int amount) {
		this.energyLevel += 10*amount; 
		System.out.println("Gorilla is happy he is eating a banana!");
		//display energy is coming from Mammal parent class 
		return this.displayEnergy(); 
		
		
	}
	
	public int climb(int times) {
		this.energyLevel -= 10 *times; 
		System.out.println("Gorilla climbs a tree!");
		return this.displayEnergy(); 		
		
	}
	
}
