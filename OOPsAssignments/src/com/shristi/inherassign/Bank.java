package com.shristi.inherassign;

public class Bank {
	double balance;

	public Bank(double balance) {
		super(); 
		this.balance = balance;
	}
	void withdraw(double amount) {
		balance-=amount;
		System.out.println("withdrwing "+amount);
	}
	void deposit(double amount) {
		balance+=amount;
		System.out.println("Depositing "+amount);
	}
	double getBalance() {
		return balance;
	}
	

}
