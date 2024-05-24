package array;

import java.util.Scanner;

public class ForLoopfortakingUserInputandprinting {

	public static void main(String[] args) {
		/*
		 * Write a program to store all the names of the students in an array.
		 * 
		 * Print all the members of this array.
		 */
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 5 names...");
		for(int i=0; i<names.length; i++) {
			
			System.out.print("Enter name: ");
			names[i] = sc.next();
		}
		
		System.out.println("\nPrinting all the names given by you...");
		for(int i=0; i<names.length; i++) {
			
			System.out.println(names[i]);
		}
		
		
		/*String[] names = new String[10];
		names[0] = "Kartik";
		names[1] = "Suyog";
		names[2] = "Abhishek";
		names[3] = "Akash";
		names[4] = "Sanket";
		names[5] = "Mayur";
		names[6] = "Suraj";
		names[7] = "Prajval";
		names[8] = "Aishwarya";
		names[9] = "Anjali";
		
		for(int i=0; i<names.length; i++) {
			
			System.out.println(names[i]);
		}*/
		
		
	}

}
