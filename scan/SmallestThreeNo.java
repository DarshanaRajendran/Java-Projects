package com.lumen.scan;

import java.util.Scanner;

public class SmallestThreeNo {

	public static void main(String[] args) {

		int a,b,c,smallest;
		Scanner scanner = new Scanner(System.in);	   	 
	    System.out.println("Enter a first number");
        a=scanner.nextInt();
        System.out.println("Enter a second number");
        b=scanner.nextInt();
        System.out.println("Enter a third number");
        c=scanner.nextInt();
		if(a<b && a<c) {
			smallest = a;
		} 
		else if (b<c) {
			smallest = b;
			
		}
		else {
			smallest = c;
		}
			
		System.out.println(smallest + " is the smallest number");
		scanner.close();

	}

}
