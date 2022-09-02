package com.shristi.interfaces;

public class Basic implements BasicCalculator {

	@Override
	public void add(int x, int y) {
		System.out.println("sum "+(x+y));
	}

	@Override
	public void difference(int x, int y) {
	System.out.println("difference "+(x-y));

	}

	@Override
	public void product(int x, int y) {
		System.out.println("Product "+(x*y));

	}

	@Override
	public void divide(int x, int y) {
		System.out.println("Division "+(x/y));

	}

}
