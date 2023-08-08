package com.lumen.scan;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array length : ");
		int len=scanner.nextInt();
		int array[]=new int[len];
		System.out.print("Enter " + len + " Element to Store in Array :\n");
		for(int i=0; i<len; i++)
        {
           array[i] = scanner.nextInt();
        } 
		for(int i=0;i<array.length;i++) {
			array[i] = (int)Math.sqrt(array[i]);
		}
		System.out.println("New array after finding square root ");;
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+" ");
		}
		scanner.close();
	}

}
