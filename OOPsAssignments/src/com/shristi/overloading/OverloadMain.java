package com.shristi.overloading;

public class OverloadMain {
	String name,designation;
	public void calcBonus(String name,String designation,int...x) {
		System.out.print("Bonus for "+name+" as "+designation+" is ");
		int sum=0;
		for (int i : x) {
			sum+=i;
			
		}
		System.out.print(sum+"\n");
		
	}
	public static void main(String[] args) {
		OverloadMain emp=new OverloadMain();
		emp.calcBonus("John","Manager",1000);
		emp.calcBonus("Mark","programmer",1000, 1500);
		emp.calcBonus("Cody","Director",1000,1500,2000);		
	}

}
