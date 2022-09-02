package com.shristi.lamda;


public class Main {
	public static void main(String[] args) {
	Calculator calc=(x,y)->{
		System.out.println("sum "+(x+y));
	};
	calc.calculate(100, 20);
	calc=(x,y)->{
		System.out.println("difference "+(x-y));
	};
	calc.calculate(100, 20);
	calc=(x,y)->{
		System.out.println("Product "+(x*y));
	};
	calc.calculate(100, 20);
	calc=(x,y)->{
		System.out.println("Division "+(x/y));
	};
	calc.calculate(100, 20);	
}

}
