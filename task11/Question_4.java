package org.task11;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		 a=sc.nextInt();
		System.out.println("Enter second value");
		 b=sc.nextInt();
		try{
			
		 System.out.println(a/b);
		 
		}catch(ArithmeticException e) {
			
			System.out.println("Error:Division by zero is not allowed");
		}
		
		 
	}

}
