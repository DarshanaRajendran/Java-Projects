package com.lumen.assignments;

import java.util.Scanner;

public class PatterOne {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) 
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.print(" ");
        } 
        scanner.close();
	}

}
