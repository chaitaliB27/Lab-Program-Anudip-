package stringProgram;

import java.util.Scanner;

public class ReversePattern {

	public static void main(String[] args) {
		/*
		 * Take any word from user and print it in the following pattern
		 * Example: James
		 * 
		 * James
		 * Jame
		 * Jam
		 * Ja
		 * j
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String word = sc.nextLine();
		
		for(int i=word.length()-1; i>=0; i--) {
			
			for(int j=0; j<=i; j++) {
				
				System.out.print(word.charAt(j));
			}
			
			System.out.println();
		}
	}
}

