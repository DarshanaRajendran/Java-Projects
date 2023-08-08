package com.lumen.assignments;

public class Fibonacci {

	public static void main(String[] args) {

		int x=1;
		int y=2,z;
		int count=10;
		System.out.println(x+"\n"+y);
		for(int i=0;i<count;i++) {
			z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
	}

}
