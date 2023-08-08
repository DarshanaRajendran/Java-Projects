package com.lumen.interfaces;
public class CalculatorMain {

	public static void main(String[] args) {

		Calculator calculator=(int x, int y)->System.out.println("Add "+(x+y));
		calculator.calculate(10,20);
		calculator=(int x, int y)->System.out.println("Subtract "+(x-y));
		calculator.calculate(50,20);
		calculator=(int x, int y)->System.out.println("Product "+(x*y));
		calculator.calculate(10,2);
		calculator=(int x, int y)->System.out.println("Division "+(x/y));
		calculator.calculate(80,20);
	}

}
