package com.shristi.abstractassign;

public class Current extends Bank {
	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Current withdraw "+amount);
		balance=balance-amount-5000;
		
		}

	@Override
	void deposit(double amount) {
		System.out.println("Current Deposit "+amount);
		balance=balance+amount;
	}
	

}
