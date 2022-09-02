package com.shristi.abstractassign;

import java.util.Scanner;


public class ATMMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to @1 ATM\nEnter Account Type \n 1.Savings\n 2.Current");
		int ch = sc.nextInt();
		Bank bank = null;
		switch (ch) {
		case 1:
			bank = new Savings(10000);
			break;

		case 2:
			bank = new Current(8000);
			break;
		default:
			break;
		}
		System.out.println("Enter W to withdraw or D to deposit");
		String amt =sc.next();
		if(amt.equals("W")) {
		System.out.println("Enter Amount to withdraw ");
		double wd=sc.nextDouble();
		bank.withdraw(wd);
		System.out.println("Balance After Withdraw "+bank.getBalance());
		}
		else if(amt.equals("D")){
			System.out.println("Enter Amount to Deposit ");
			double dp=sc.nextDouble();
			bank.deposit(dp);
			System.out.println("Balance after Deposit "+bank.getBalance());

		}
		else {
			System.out.println("wrong choice");
		}
		
		sc.close();


	}

}
