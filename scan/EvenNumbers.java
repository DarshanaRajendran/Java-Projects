package com.lumen.scan;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {

		int number;
		Scanner scanner = new Scanner(System.in);	   	 
	    System.out.println("Enter a number");
        number=scanner.nextInt();
		for(int i=1;i<=number;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		scanner.close();
	}

}
