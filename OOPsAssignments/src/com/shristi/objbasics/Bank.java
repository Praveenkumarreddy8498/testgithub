package com.shristi.objbasics;

public class Bank {
	double balance;

	public Bank(double balance) {
		this.balance = balance;
	}
	public void withdraw(int x) {
		System.out.println("withdrawing "+x);
		balance-=x;
		
	}
	public void deposit(int x) {
		System.out.println("Depositing "+x);
		balance+=x;
	}
	public double getBalance() {
		return balance;
		
	}
	public static void main(String[] args) {
		Bank b=new Bank(15000);
		b.withdraw(5000);
		b.deposit(10000);
		System.out.println("Balance is "+b.getBalance());
	}

	

}
