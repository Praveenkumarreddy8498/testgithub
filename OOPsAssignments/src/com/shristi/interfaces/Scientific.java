package com.shristi.interfaces;

public class Scientific extends Basic implements ScientificCalculator {

	@Override
	public void square(int x) {

		System.out.println("Square "+(x*x));
	}
	
	@Override
	public void cube(int x) {

		System.out.println("Cube "+(x*x*x));

	}

	

}
