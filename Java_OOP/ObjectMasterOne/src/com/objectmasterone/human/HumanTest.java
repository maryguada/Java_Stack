package com.objectmasterone.human;

public class HumanTest {
	public static void main(String[] args ) {
		Human Ben = new Human(); 
		Human Howard = new Human(); 
	
		Ben.attack(Howard); 
		Ben.attack(Howard);
		Howard.attack(Ben);
	
}
}
