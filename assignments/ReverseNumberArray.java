package com.lumen.assignments;

import java.util.Scanner;

public class ReverseNumberArray {

	public static void main(String[] args) {

		int number,j=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        number = scanner.nextInt();
        int array[] = new int[number];
        int rev[] = new int[number];
        System.out.println("Enter "+number+" elements ");
        for(int i=0; i < number; i++)
        {
            array[i] = scanner.nextInt();
        }
        System.out.println("Reverse of an array is :");
        for(int i=number;i>0 ; i--,j++)
        {
            rev[j] = array[i-1];
            System.out.println(rev[j]);
        }
        scanner.close();
	}

}
