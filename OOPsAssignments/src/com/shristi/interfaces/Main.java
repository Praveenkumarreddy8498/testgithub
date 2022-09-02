package com.shristi.interfaces;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class Main {
	public static void main(String[] args) {
		BasicCalculator basic= new Basic();
		basic.add(100, 20);
		basic.difference(100, 20);
		basic.product(100, 20);
		basic.divide(100, 20);
	
		ScientificCalculator sfic=new Scientific();
		sfic.square(12);
		sfic.cube(5);
		int a=25;
		Consumer<Integer> cs=(b)->{
			System.out.println("addition using Consumer"+(a+b));
		};
		cs.accept(25);
		
		Supplier<String> sp=()->"using supplier".toUpperCase();
		System.out.println(sp.get());
		
		String role="Admin";
		BiConsumer<String, Integer> bc =(name,age)->{
			if(name.equalsIgnoreCase(role)&age>30) 

				System.out.println("welcome "+name);
			
			else 
				System.out.println("Wrong User");
		};
		bc.accept("Admin".toUpperCase(),35);
		
		
		
		
		}
	}

