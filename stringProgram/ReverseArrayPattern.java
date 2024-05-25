package stringProgram;

import java.util.Scanner;

public class ReverseArrayPattern {

	public static void main(String[] args) {
		/*
		 * Write a program to take user input of any word.
		 * Example:-
		 * String s = "Anudip";
		 * 
		 * print pattern as following
		 * 
		 * pidunA
		 * pidun
		 * pidu
		 * pid
		 * pi
		 * p
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String word = sc.nextLine();
		
		for(int i=0; i<=word.length()-1; i++) {
			
			for(int j=word.length()-1; j>=i; j--) {
				
				System.out.print(word.charAt(j));
			}
			
			System.out.println();
		}
	}

}
