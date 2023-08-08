package com.lumen.assignments;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		
		int number, reverse = 0; 
		Scanner scanner = new Scanner(System.in);	   	 
	    System.out.println("Enter a number");
        number=scanner.nextInt();
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);
		scanner.close();
	}

}
