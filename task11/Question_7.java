package org.task11;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age");
		int age = scanner.nextInt();
		
	try {
		if(age<18) {
			
			throw new InvalidAgeException("Age must be 18 or older");
		}
		System.out.println("Age entered ;"+ age);
		
	}catch(InvalidAgeException e) {
		
		System.out.println("Error:"+e.getMessage());
	}
		
		
		scanner.close();		

	}

}
