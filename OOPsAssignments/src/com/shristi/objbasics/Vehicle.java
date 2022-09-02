package com.shristi.objbasics;

public class Vehicle {
	String name;
	int model;
	double price;

	Vehicle(String name,int model,double price){
		this.name=name;
		this.model=model;
		this.price=price;
	}
	
	void getDetails(){
		
		System.out.println(name+" car of model "+model+"\nprice is "+price);
	}
	public static void main(String[] args) {
		Vehicle v1=new Vehicle("Ford",7252,120000);
		v1.getDetails();
		Vehicle v2=new Vehicle("Kia",5243,150000);
		v2.getDetails();
		
	}
	
}
