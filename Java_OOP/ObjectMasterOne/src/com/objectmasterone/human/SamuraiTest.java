package com.objectmasterone.human;

public class SamuraiTest extends Human {
	public static void main (String[]  args) {
		Samurai Dre = new Samurai(); 
		Samurai Tiger = new Samurai(); 
		
		Dre.deathBlow(Tiger);
		Dre.meditate();
		Dre.howMany(); 
	}
}
