package com.lumen.scan;

import java.util.Scanner;

public class GreatestOfThreeNo {

	public static void main(String[] args) {

		int x,y,z;
		Scanner scanner = new Scanner(System.in);	   	 
	    System.out.println("Enter a first number");
        x=scanner.nextInt();
        System.out.println("Enter a second number");
        y=scanner.nextInt();
        System.out.println("Enter a third number");
        z=scanner.nextInt();
        scanner.close();
        int greatestNumber = x>y ? (x>z ? x:z) : (y>z ? y:z);
        System.out.println("The Greatest of three number is: "+greatestNumber);  
	}

}
