package com.lumen.assignments;

public class Greater {

	public static void main(String[] args) {

		int [] arr = {10, 40, 500, 50, 19};
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if (arr[i] > max)
                max = arr[i];
		}
        System.out.println(max);
	}

}
