package org.task11;

public class Question_5 {

	public static void main(String[] args) {
		
		//ArrayIndexOutOfBoundException
		int [] num = {1,2,3,4,5};
		
		try {
			//this will throw an exception
			System.out.println(num[9]);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Error: "+ e.getMessage());
			
		}
		
		//SrtingOutOfBoundsException
		String s ="Java selenium";
		
		try {
			//this will through an exception
		    char c = s.charAt(15);
		
		}catch(StringIndexOutOfBoundsException e) {
			
			System.out.println("Error: "+ e.getMessage());
		}

	}

}
