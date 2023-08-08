package com.lumen.scan;

import java.util.Scanner;

public class MaximumOccurrence {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

	    char letter;
	    String word = "";
	    System.out.println("Enter a character to search");
	    letter = scanner.next().charAt(0);
	    System.out.println("Enter the string to search");
	    word = scanner.next();

	    int count = 0;
	    for (int i = 0; i < word.length(); i++) {
	        char ch = word.charAt(i);
	        if (ch == letter) {
	            count++;
	        }
	    }
	    System.out.printf("There are %d occurrences of %s in %s", count, letter, word);
	    scanner.close();

	}
}
