package com.lumen.fun;

public class ShapeMain {

	public static void main(String[] args) {

		ShapeFactory shapefactory = new ShapeFactory();
		
		shapefactory.printArea((double x, double y)->{
			System.out.println("Area for Rectangle "+(x*y));
		}, 10.0, 20.2);
		
		shapefactory.printArea((double x, double y)->{
			System.out.println("Area for Triangle "+(0.5*x*y));
		}, 30.0, 20.2);
	}

}
