package com.lumen.interfaces;
public class ClacMain {

	public static void main(String[] args) {

		Basic calculator = new Basic();
		calculator.add(2, 3);
		calculator.product(8, 9);
		calculator.difference(10,2);
		calculator.divide(6,2);
		ScientificCalculator scientific = new Scientific();
		scientific.cube(2);
		scientific.square(6);
		
	}

}
