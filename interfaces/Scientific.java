package com.lumen.interfaces;

public class Scientific implements ScientificCalculator{

	@Override
	public void cube(int x) {
		System.out.println("Cube is "+(x*x*x));
	}

	@Override
	public void square(int x) {
		System.out.println("Square is "+(x*x));
	}
	

	
}
