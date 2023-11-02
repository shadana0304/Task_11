package org.task11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name: ");
		String filename= sc.nextLine();
		try {
		File f= new File(filename);
		Scanner sca= new Scanner(f);
	while(sca.hasNextLine()) {
		String line=sca.nextLine();
		System.out.println(line);
	}
		sca.close();
		}catch(FileNotFoundException e) {
			
			System.out.println("Error:File not found");
			
		}

	}

}
