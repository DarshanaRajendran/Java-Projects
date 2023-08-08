package com.lumen.assignments;

public class Smallest {

	public static void main(String[] args) {

		int [] arr = {100, 40, 500, 50, 19};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (arr[i] < min)
                min = arr[i];
		}
        System.out.println(min);
	}
}
