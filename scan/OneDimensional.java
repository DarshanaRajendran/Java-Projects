package com.lumen.scan;

import java.util.Scanner;

public class OneDimensional {

	public static void main(String[] args) {
		int len;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array length : ");
		len=scanner.nextInt();
		int array[]=new int[len];
		System.out.print("Enter " + len + " Element to Store in Array :\n");
		for(int i=0; i<len; i++)
        {
           array[i] = scanner.nextInt();
        } 
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
		  sum += array[i];
		}
		int average=sum/array.length;
		System.out.println("Sum of all numbers in an array is "+sum);
		System.out.println("Average of all numbers in an array is "+average);
		scanner.close();
	}

}
