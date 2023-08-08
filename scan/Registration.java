package com.lumen.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {

		String usernames[] = {"Ram","Ravi","Rani"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name to Register");
		String name = scanner.next();
		int f=0;
		for(String username:usernames) {
			if(username.equals(name)) {
				f = 1;
				break;
			}
		}
		if(f==1) {
			System.out.println("Name is not unique");
			
		}
		else {
			System.out.println("You are registered");
		}
		 scanner.close();
	}

}
