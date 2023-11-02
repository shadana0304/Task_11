package org.task11;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		
        String correctpassword = "saranya@1234";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your password :");
        
        String enteredpassword = sc.nextLine();
     try { 
        if(!enteredpassword.equals(correctpassword) ) {
        	
        	throw new IncorrectPasswordException("Incorrect password entered.");
        }
        	System.out.println("Login successfull");
      } catch(IncorrectPasswordException e) {
    	  
    	  System.out.println("Error: "+e.getMessage());
      }
     sc.close();
        
}
}