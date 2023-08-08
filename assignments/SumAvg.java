package com.lumen.assignments;

public class SumAvg {

	public static void main(String[] args) {

		int[] array = {1, 5, 10, 80};
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
		  sum += array[i];
		}
		int average=sum/array.length;
		System.out.println("Sum of all digits is "+sum);
		System.out.println("Average of all digits is "+average);
		
	}

}
