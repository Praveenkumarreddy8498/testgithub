package com.shristi.overloading;

public class Employee {
	String name,designation;
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	double calcBonus(double basicAllowance) {
		return(basicAllowance);
	}
	double calcBonus(double basicAllowance, double carAllowance) {
		return(basicAllowance+carAllowance);
	}
	double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
		return(basicAllowance+carAllowance+houseAllowance);

	}
	public static void main(String[] args) {
		Employee e1=new Employee("john","admin");
		Employee e2=new Employee("mark","HR");
		Employee e3=new Employee("cody","QCE");
		System.out.println("Bonus for john is "+e1.calcBonus(10000));
		System.out.println("Bonus for mark is "+e2.calcBonus(10000, 15000));
		System.out.println("Bonus for cody is "+e3.calcBonus(10000,15000,20000));
	}

}

