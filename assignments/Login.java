package com.lumen.assignments;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		String usernames[] = {"Ram","Ravi","Rani"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name to Login");
		String name = scanner.next();
		int f=0;
		for(String username:usernames) {
			if(username.equals(name)) {
				f = 1;
				
			}
			if(f==1) {
				System.out.println("Logged in");
				break;
			}
			else {
				System.out.println("Invalid");
				break;
			}
		}
		scanner.close();
	}

}
