package com.zookeeper.mammal;

// we are creating a Mammal class that has an energy level and displayEnergy method. The displayEnerygy() 
//method should show the animals energy level as well as return it. 

public class Mammal {
	
	// declare variables 
	public String name; 
	public int energyLevel; 
	public int displayEnergy() {
		
		return this.energyLevel;
	}
	// setter 
	public Mammal() {
		this.energyLevel =100; 
	}
	
	//getter 
	public int getEnergy() {
		return energyLevel;
	}
	
	//setter 
	public void setName(String name) {
		this.name = name; 
	}
	
	//getter 
	public String getName() {
		return this.name; 
	}
	
	
	
	
	
	
}
