package com.lumen.scan;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Sentence");
        String inputString = scanner.nextLine();
        String [] words = inputString.split(" ");
        String longestWord = "";
        int longestWordLen = 0;
        for(int i= 0; i < words.length;i++){
            String word = words[i];
            int len = word.length();
            if(len > longestWordLen ){
                longestWord = word;
                longestWordLen = len;
            }
        }
        System.out.println(longestWord);
        scanner.close();
	}

}
