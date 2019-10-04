package com.codingdojo.bankaccount;

public class bankaccountTest {
	public static void main (String[] args) {
		bankaccount b = new bankaccount(); 
		bankaccount b1 = new bankaccount(); 
		System.out.println(b.getAccountNumber());
		System.out.println(b1.getAccountNumber());
		
		b.deposit("checking", 500.0); 
		b.deposit("savings", 10.0);
		
		System.out.println(b.getChecking());
		System.out.println(b.getSavings());
		System.out.println(bankaccount.getTotal());
		System.out.println(bankaccount.getNumberofAccounts());
		
	}
}
