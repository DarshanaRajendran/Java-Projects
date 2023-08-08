package com.lumen.interfaces;

public class Basic implements BasicCalculator{

	@Override
	public void add(int x, int y) {
		System.out.println("Sum "+(x+y));
	}

	@Override
	public void product(int x, int y) {
		System.out.println("Product "+(x*y));
	}

	@Override
	public void difference(int x, int y) {
		System.out.println("Difference is "+(x-y));
		
	}

	@Override
	public void divide(int x, int y) {
		System.out.println("Divide is "+(x/y));
	}
	

	
}
