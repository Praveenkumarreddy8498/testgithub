package com.shristi.inherassign;

public class Savings extends Bank{

	public Savings(double balance) {
		super(balance);
		}

	@Override
	void withdraw(double amount) {
		System.out.println("Savings withdraw "+amount);
		balance=balance-amount;
	}

	@Override
	void deposit(double amount) {
		System.out.println("Savings Deposit "+amount);
		balance=balance+amount+500;
	}
	
	

}
