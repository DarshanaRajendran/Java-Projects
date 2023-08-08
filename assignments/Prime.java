package com.lumen.assignments;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		
        System.out.println("Enter a number : ");
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();
		int count=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==2)
			System.out.println("Prime");
		else
			System.out.println("Not a prime");
		 scanner.close();
	}

}
