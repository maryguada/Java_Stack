package com.codingdojo.bankaccount;

import java.util.Random;


public class bankaccount {
	private String accountNumber; 
	private double savings; 
	private double checking; 	
	//static variable exist in class level 
	private static int numberOfAccounts=0; 
	private static double total=0.0; 
	
	//Constructor 
	public bankaccount() {
		this.accountNumber = this.generateAccountNumber();
		
		numberOfAccounts++; 
	}
	
	public double deposit(String accountType, double amount) {
		// we use equals so its going to compare obj address
		if(accountType.equals("Checking")) {
			this.checking +=amount; 
			total += amount;
			return this.checking; 
			
		}else{
			this.savings += amount; 
			return this.savings ;
		}
		
	}
	
	public double withdraw(String accountType, double amount) {
		if(accountType.equals("Checking")){
			if (amount <= this.checking){
			this.checking -= amount; 
			total -= amount;
			return this.checking; 
			
		}else{
			return this.checking; 
		}
	}else{
		if(amount<=this.savings) {
			this.savings -= amount;
			total -= amount;
			return this.savings;
		}else{
			return this.savings;
		}
	}
}
	

	
	//methods / getters and setters 
	private String generateAccountNumber() {
		String acc = ""; 
		Random r = new Random();
		
		for(int i = 0; i<10; i++) {
			// valueOf converts the int to string 
			acc += String.valueOf(r.nextInt(9));
		}
		
		
		return acc; 
	}

	
	public String getAccountNumber() {
		return accountNumber;
	}

	public double getSavings() {
		return savings;
	}


	public double getChecking() {
		return checking;
	}


	public static int getNumberofAccounts() {
		return numberOfAccounts;
	}

	public static double getTotal() {
		return total;
	}


}


